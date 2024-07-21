package com.arcadone.multiselectiongesture.composables

import androidx.compose.animation.core.animateDp
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.FilterQuality
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.compose.AsyncImagePainter
import coil.request.ImageRequest
import com.arcadone.multiselectiongesture.model.ImageModel
import com.arcadone.multiselectiongesture.ui.theme.MultiSelectionGestureAppTheme
import com.arcadone.multiselectiongesture.ui.theme.ThemeDS
import com.arcadone.multiselectiongesture.utils.drawRoundedRectangle

@Composable
fun SelectableImageItem(
    modifier: Modifier = Modifier,
    imageModel: ImageModel? = null,
    filterQuality: FilterQuality = FilterQuality.Low,
    onState: ((AsyncImagePainter.State) -> Unit)? = null,
    contentDescription: String,
    isImageSelected: Boolean = false,
    isImageLocked: Boolean = false,
) {
    val context = LocalContext.current
    val overlay = ThemeDS.colors.black.copy(alpha = 0.6F)
    val roundedCornerValue = 6.dp
    val transition = updateTransition(isImageSelected, label = "selected")
    val padding by transition.animateDp(label = "padding") { stateSelected ->
        if (stateSelected) 2.dp else 0.dp
    }
    val roundedCornerShape by transition.animateDp(label = "corner") { stateSelected ->
        if (stateSelected) 8.dp else roundedCornerValue
    }
    val border = if (isImageSelected) Modifier.border(
        BorderStroke(
            width = 4.dp,
            color = ThemeDS.colors.accent1,
        ), shape = RoundedCornerShape(4.dp)
    ) else Modifier

    val imageModelImage = imageModel?.image

    Surface(
        color = ThemeDS.colors.white,
        modifier = modifier.aspectRatio(1f),
        tonalElevation = 3.dp
    ) {
        Box {
            AsyncImage(
                model = ImageRequest.Builder(context)
                    .data(imageModelImage)
                    .crossfade(true)
                    .build(),
                modifier = Modifier
                    .matchParentSize()
                    .padding(padding)
                    .background(ThemeDS.colors.white)
                    .then(border)
                    .clip(RoundedCornerShape(roundedCornerShape)),
                filterQuality = filterQuality,
                onState = onState,
                contentScale = ContentScale.Crop,
                contentDescription = contentDescription,
            )
            if (isImageLocked) {
                Canvas(modifier = Modifier.matchParentSize()) {
                    drawRoundedRectangle(
                        cornerRadius = roundedCornerValue.toPx(),
                        color = overlay
                    )
                }
            }
            CustomRadioButton(
                modifier = Modifier
                    .padding(12.dp +padding)
                    .align(Alignment.BottomEnd),
                selected = isImageSelected
            )
        }
    }
}

@Preview
@Composable
private fun SelectableImageItemPreview() {
    MultiSelectionGestureAppTheme {
        SelectableImageItem(
            contentDescription = "Image",
            isImageSelected = true,
            isImageLocked = false
        )
    }
}

@Preview
@Composable
private fun SelectableImageLockedItemPreview() {
    MultiSelectionGestureAppTheme {
        SelectableImageItem(
            contentDescription = "Image",
            isImageSelected = false,
            isImageLocked = true
        )
    }
}