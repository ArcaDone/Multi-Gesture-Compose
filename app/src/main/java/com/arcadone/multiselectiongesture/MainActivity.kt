package com.arcadone.multiselectiongesture

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.arcadone.multiselectiongesture.composables.Footer
import com.arcadone.multiselectiongesture.composables.Header
import com.arcadone.multiselectiongesture.composables.ModalBottomSheet
import com.arcadone.multiselectiongesture.composables.OneButtonDialog
import com.arcadone.multiselectiongesture.composables.PhotoGridMultiSelect
import com.arcadone.multiselectiongesture.model.ImageModel
import com.arcadone.multiselectiongesture.model.PhotoGridSelectionState
import com.arcadone.multiselectiongesture.ui.theme.MultiSelectionGestureAppTheme
import org.koin.androidx.compose.koinViewModel

class MainActivity : ComponentActivity() {

    private val photos: List<ImageModel> =
        List(40) { ImageModel(image = "https://picsum.photos/id/${(0..1000).random()}/600/600") }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MultiSelectionGestureAppTheme {
                GridView()
            }
        }
    }

    @Composable
    @OptIn(ExperimentalMaterial3Api::class)
    private fun GridView() {

        val viewModel = koinViewModel<PhotoGridViewModel>()
        val showBottomSheet = viewModel.showBottomSheet
        val snackBarHostState = remember { SnackbarHostState() }
        val showZoomBottomSheet = remember { mutableStateOf(false) }

        LaunchedEffect(Unit) {
            viewModel.setEvent(
                PhotoGridEvents.OnStart(
                    lockedImage = null,
                    imageModelList = photos,
                    selectedImage = emptyList(),
                    selectionConstraints = SelectionConstraints(1, 50),
                )
            )
        }

        BaseView(
            snackBarHostState = snackBarHostState,
            effectFlow = viewModel.effect,
            viewStateFlow = viewModel.uiState,
            topBar = { state ->
                Header(
                    imageModelList = photos,
                    selectedList = state.selectedImage,
                    selectionLimitReached = state.selectionLimitReached,

                    onMultiSelectHeaderTap = { selectionState ->
                        if (selectionState == PhotoGridSelectionState.SELECT_ALL) {
                            viewModel.setEvent(PhotoGridEvents.SelectAll(state.imageModelList))
                        } else {
                            viewModel.setEvent(PhotoGridEvents.UnSelectAll(state.imageModelList))
                        }
                    }
                )
            },
            bottomBar = { state ->
                Footer(
                    selectedImageNumber = state.selectedImage.size,
                    maxSelectableImageNumber = state.selectionConstraints.max,
                )
            }
        ) { innerPadding, state ->
            PhotoGridMultiSelect(
                modifier = Modifier.padding(innerPadding),
                imageModelList = photos,
                selectedList = state.selectedImage,
                onImageLongClick = { index, photo ->
                    Log.d("PhotoGrid", "onImageLongClick:$index, $photo")
                    showZoomBottomSheet.value = true
                },
                onSelectionChange = { imageModel ->
                    viewModel.setEvent(PhotoGridEvents.OnPhotoTap(imageModel))
                },
                lockedImage = state.lockedImage
            )

        }

        if (showZoomBottomSheet.value) {
            OneButtonDialog(
                title = stringResource(R.string.on_long_press_reached),
                description = stringResource(R.string.do_something_with_this_gesture),
                buttonText = stringResource(R.string.ok),
                onDismissRequest = {
                    showZoomBottomSheet.value = false
                },
            )
        }
        if (showBottomSheet.value) {
            ModalBottomSheet(
                titleTextResources = R.string.limit_reached,
                descriptionTextResources = R.string.selection_description,
                onDismissRequest = {
                    viewModel.setEvent(PhotoGridEvents.HideSelectionLimitReachedBottomSheet)
                })
        }
    }
}
