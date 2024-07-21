package com.arcadone.multiselectiongesture.composables

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.arcadone.multiselectiongesture.R
import com.arcadone.multiselectiongesture.model.ImageModel
import com.arcadone.multiselectiongesture.model.PhotoGridSelectionState
import com.arcadone.multiselectiongesture.ui.theme.MultiSelectionGestureAppTheme
import com.arcadone.multiselectiongesture.ui.theme.ThemeDS

@Composable
fun Header(
    modifier: Modifier = Modifier,
    text: String = "Multi Gesture",
    imageModelList: List<ImageModel>,
    selectedList: List<ImageModel>,
    onMultiSelectHeaderTap: (PhotoGridSelectionState) -> Unit = { },
    selectionLimitReached: Boolean
) {

    val isAllImagesSelected = imageModelList.all { it in selectedList }

    val selectionState = when {
        (selectionLimitReached && !isAllImagesSelected) -> PhotoGridSelectionState.CLEAR_SELECTION
        isAllImagesSelected -> PhotoGridSelectionState.DESELECT_ALL
        else -> PhotoGridSelectionState.SELECT_ALL
    }

    val textRes = when (selectionState) {
        PhotoGridSelectionState.SELECT_ALL -> R.string.select_all
        PhotoGridSelectionState.DESELECT_ALL -> R.string.deselect_all
        PhotoGridSelectionState.CLEAR_SELECTION -> R.string.clear_selection
    }
    Row(
        modifier = Modifier
            .then(modifier)
            .fillMaxWidth()
            .padding(vertical = 32.dp, horizontal = 4.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        HeadingLarge1(
            modifier = Modifier.weight(1f),
            text = text,
            fontWeight = FontWeight.Bold
        )

        BodySmall(
            modifier = Modifier
                .padding(end = 16.dp)
                .clickable {
                    onMultiSelectHeaderTap(selectionState)
                },
            textResources = textRes,
            fontWeight = FontWeight.Bold,
            color = ThemeDS.colors.accent1
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun HeaderPreview() {
    MultiSelectionGestureAppTheme {
        Header(
            imageModelList = emptyList(),
            selectedList = emptyList(),
            selectionLimitReached = false
        )
    }
}
