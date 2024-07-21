package com.arcadone.multiselectiongesture

import android.util.Log
import androidx.activity.compose.BackHandler
import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.compose.LocalLifecycleOwner
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.repeatOnLifecycle
import com.arcadone.multiselectiongesture.ui.theme.ThemeDS
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.withContext

@Composable
fun <T, K> BaseView(
    modifier: Modifier = Modifier,
    snackBarHostState: SnackbarHostState,
    viewStateFlow: StateFlow<T>,
    topBar: (@Composable (viewState: T) -> Unit)? = null,
    isLoading: Boolean = false,
    withAnimation: Boolean = false,
    bottomBar: (@Composable (viewState: T) -> Unit)? = null,
    effectFlow: Flow<K>?,
    onEffect: (suspend CoroutineScope.(effect: K) -> Unit)? = null,
    onDeviceBackTap: (viewState: T)-> Unit = {  },
    content: @Composable (innerPadding: PaddingValues, viewState: T) -> Unit
) {
    val state = viewStateFlow.collectAsStateWithLifecycle().value

    Scaffold(
        containerColor = ThemeDS.colors.white,
        snackbarHost = {
            SnackbarHost(hostState = snackBarHostState)
        },
        modifier = modifier,
        topBar = {
            state.also { s ->
                topBar?.invoke(s)
            }
        },
        bottomBar = {
            state.also { s ->
                bottomBar?.invoke(s)
            }
        }
    ) { innerPadding ->
        when (withAnimation) {
            true -> Crossfade(
                modifier = Modifier.padding(innerPadding),
                targetState = state,
                content = { state ->
                    content(innerPadding, state)
                },
                label = ""
            )
            else -> state.also { s ->
                content(innerPadding,s)
            }
        }
    }

    BackHandler {
        onDeviceBackTap(state)
    }

    if (isLoading) {
        Log.d("BaseView", "isLoading")
    }

    val lifecycleOwner = LocalLifecycleOwner.current
    LaunchedEffect(Unit) {
        lifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
            withContext(Dispatchers.Main.immediate) {
                effectFlow?.collect {
                    onEffect?.invoke(this, it)
                }
            }
        }
    }
}