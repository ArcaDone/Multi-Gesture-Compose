package com.arcadone.multiselectiongesture.composables

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.arcadone.multiselectiongesture.R
import com.arcadone.multiselectiongesture.ui.theme.MultiSelectionGestureAppTheme
import com.arcadone.multiselectiongesture.ui.theme.ThemeDS

@Composable
fun CustomRadioButton(
    modifier: Modifier = Modifier,
    backgroundColor: Color = ThemeDS.colors.accent1,
    circleRadius: Dp = 10.dp,
    iconSize: Dp = 10.dp,
    selected: Boolean = false
) {

    val boxModifier =
        if (selected) Modifier
        else Modifier.border(2.dp, Color.LightGray, CircleShape)

    Box(
        modifier = Modifier
            .then(modifier)
            .size(circleRadius * 2)
            .then(boxModifier),
        contentAlignment = Alignment.Center
    ) {
        Canvas(modifier = Modifier.matchParentSize()) {
            val radius = circleRadius.toPx()
            drawCircle(
                color = if (selected) backgroundColor else Color.Transparent,
                radius = radius
            )
        }
        if (selected)
            Image(
                painter = painterResource(id = R.drawable.ic_check_icon),
                contentDescription = "Check",
                modifier = Modifier.size(iconSize),
                contentScale = ContentScale.Inside
            )
    }
}

@Preview
@Composable
private fun CustomRadioButtonPreview() {
    MultiSelectionGestureAppTheme {
        CustomRadioButton(selected = true)
    }
}

@Preview
@Composable
private fun CustomRadioButtonDeselectedPreview() {
    MultiSelectionGestureAppTheme {
        CustomRadioButton(selected = false)
    }
}
