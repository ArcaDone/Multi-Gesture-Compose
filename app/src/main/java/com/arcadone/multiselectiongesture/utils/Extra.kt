package com.arcadone.multiselectiongesture.utils

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.unit.dp

fun DrawScope.drawRoundedRectangle(
    color: Color,
    width: Float = size.minDimension,
    height: Float = size.minDimension,
    cornerRadius: Float = 8.dp.toPx()
) {
    drawRoundRect(
        color = color,
        topLeft = center.copy(x = center.x - width / 2, y = center.y - height / 2),
        size = androidx.compose.ui.geometry.Size(width, height),
        cornerRadius = androidx.compose.ui.geometry.CornerRadius(cornerRadius, cornerRadius)
    )
}
