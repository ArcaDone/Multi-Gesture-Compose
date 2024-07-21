package com.arcadone.multiselectiongesture.composables

import androidx.annotation.StringRes
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.SheetState
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.arcadone.multiselectiongesture.R
import com.arcadone.multiselectiongesture.ui.theme.MultiSelectionGestureAppTheme
import com.arcadone.multiselectiongesture.ui.theme.ThemeDS

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ModalBottomSheet(
    modifier: Modifier = Modifier,
    bottomSheetState: SheetState = rememberModalBottomSheetState(skipPartiallyExpanded = true),
    titleText: String = "Text String",
    @StringRes titleTextResources: Int? = null,
    descriptionText: String = "Text String",
    @StringRes descriptionTextResources: Int? = null,
    onDismissRequest: (Boolean) -> Unit
) {
    ModalBottomSheet(
        modifier = Modifier.then(modifier),
        containerColor = ThemeDS.colors.white,
        onDismissRequest = {
            onDismissRequest(false)
        },
        sheetState = bottomSheetState
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
                .padding(bottom = 32.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(bottom = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                HeadingLarge1(
                    text = titleText,
                    textResources = titleTextResources,
                    color = ThemeDS.colors.black,
                    modifier = Modifier.weight(1f)
                )
                Icon(
                    imageVector = Icons.Filled.Close,
                    tint = ThemeDS.colors.accent1,
                    contentDescription = "Close",
                    modifier = Modifier
                        .clickable { onDismissRequest(false) }
                        .size(26.dp)
                )
            }

            Spacer(modifier = Modifier.height(2.dp))
            BodyMedium(
                text = descriptionText,
                textResources = descriptionTextResources,
                color = ThemeDS.colors.black,
                modifier = Modifier.padding(bottom = 16.dp)
            )

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
private fun ModalBottomSheetWithXPreview() {
    MultiSelectionGestureAppTheme {
        ModalBottomSheet(
            titleTextResources = R.string.limit_reached,
            descriptionTextResources = R.string.selection_description,
            onDismissRequest = {}
        )
    }
}