package com.arcadone.multiselectiongesture.composables

import androidx.annotation.StringRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.arcadone.multiselectiongesture.ui.theme.MultiSelectionGestureAppTheme
import com.arcadone.multiselectiongesture.ui.theme.ThemeDS

@Composable
fun MainButton(
    modifier: Modifier = Modifier,
    text: String = "Text String",
    @StringRes textResources: Int? = null,
    onClick: () -> Unit,
    buttonHeight: Dp = 50.dp,
    shape: Shape = RoundedCornerShape(8.dp),
    contentColor: Color? = ThemeDS.colors.primary,
    textColor: Color = ThemeDS.colors.white,
    maxLines: Int = Int.MAX_VALUE,
    softWrap: Boolean = true,
    border: BorderStroke? = null,
    buttonEnabled: Boolean = true,
    verticalPadding: Dp = 8.dp
) {
    val textValue = textResources?.let { stringResource(id = textResources) } ?: text
    TextButton(
        onClick = { onClick() },
        shape = shape,
        colors = ButtonDefaults.buttonColors(
            containerColor = contentColor ?: ThemeDS.colors.primary
        ),
        enabled = buttonEnabled,
        border = border,
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = verticalPadding)
            .height(buttonHeight)
            .then(modifier)
    ) {
        HeadingMedium(
            modifier = Modifier.align(Alignment.CenterVertically),
            text = textValue,
            maxLines = maxLines,
            softWrap = softWrap,
            color = textColor
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun MainButtonPreview() {
    MultiSelectionGestureAppTheme {
        MainButton(
            modifier = Modifier.padding(all = 4.dp),
            onClick = {}
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun SecondaryButtonPreview() {
    MultiSelectionGestureAppTheme {
        MainButton(
            modifier = Modifier.padding(all = 4.dp),
            onClick = {},
            contentColor = ThemeDS.colors.white,
            textColor = ThemeDS.colors.primary,
            border = BorderStroke(2.dp, ThemeDS.colors.primary)
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun MainButtonDisabled() {
    MultiSelectionGestureAppTheme {
        MainButton(
            modifier = Modifier.padding(all = 4.dp),
            onClick = {},
            buttonEnabled = false
        )
    }
}
