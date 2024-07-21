package com.arcadone.multiselectiongesture.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.arcadone.multiselectiongesture.R
import com.arcadone.multiselectiongesture.ui.theme.MultiSelectionGestureAppTheme
import com.arcadone.multiselectiongesture.ui.theme.ThemeDS


@Composable
fun Footer(
    modifier: Modifier = Modifier,
    selectedImageNumber: Int = 0,
    maxSelectableImageNumber: Int,
) {
    Column(
        modifier = Modifier
            .then(modifier)
            .fillMaxWidth()
            .padding(vertical = 16.dp, horizontal = 4.dp),
    ) {

        BodyMedium(
            color = ThemeDS.colors.black,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Start,
            text = stringResource(
                R.string.selected_image_number,
                selectedImageNumber
            )
        )
        BodySmall(
            text = stringResource(
                R.string.max_selectable_image_number,
                maxSelectableImageNumber
            ),
            color = ThemeDS.colors.black,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Start,
        )

    }
}

@Preview(showBackground = true)
@Composable
private fun FooterPreview() {
    MultiSelectionGestureAppTheme {
        Footer(maxSelectableImageNumber = 10)
    }
}
