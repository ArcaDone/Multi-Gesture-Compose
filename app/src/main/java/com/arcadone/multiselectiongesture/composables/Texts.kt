package com.arcadone.multiselectiongesture.composables

import androidx.annotation.StringRes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import com.arcadone.multiselectiongesture.ui.theme.MultiSelectionGestureAppTheme
import com.arcadone.multiselectiongesture.ui.theme.ThemeDS

@Composable
fun PText(
    modifier: Modifier = Modifier,
    text: String = "Text String",
    @StringRes textResources: Int? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    softWrap: Boolean = true,
    textAlign: TextAlign = TextAlign.Start,
    style: TextStyle = ThemeDS.typography.headingXSmall,
    color: Color = ThemeDS.colors.black,
) {
    val textValue = textResources?.let { stringResource(id = textResources) } ?: text
    Text(
        modifier = modifier,
        text = textValue,
        textAlign = textAlign,
        style = style,
        color = color,
        maxLines = maxLines,
        softWrap = softWrap,
        overflow = overflow
    )
}

@Composable
fun HeadingLarge4(
    modifier: Modifier = Modifier,
    text: String = "Text String",
    @StringRes textResources: Int? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    fontWeight: FontWeight? = FontWeight.Normal,
    softWrap: Boolean = true,
    textAlign: TextAlign = TextAlign.Start,
    color: Color = ThemeDS.colors.black,
) {
    val textValue = textResources?.let { stringResource(id = textResources) } ?: text
    Text(
        modifier = modifier,
        text = textValue,
        textAlign = textAlign,
        style = ThemeDS.typography.headingLarge4,
        color = color,
        fontWeight = fontWeight,
        maxLines = maxLines,
        softWrap = softWrap,
        overflow = overflow
    )
}

@Composable
fun HeadingLarge3(
    modifier: Modifier = Modifier,
    text: String = "Text String",
    @StringRes textResources: Int? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    fontWeight: FontWeight? = FontWeight.Normal,
    softWrap: Boolean = true,
    textAlign: TextAlign = TextAlign.Start,
    color: Color = ThemeDS.colors.black,
) {
    val textValue = textResources?.let { stringResource(id = textResources) } ?: text
    Text(
        modifier = modifier,
        text = textValue,
        textAlign = textAlign,
        style = ThemeDS.typography.headingLarge3,
        color = color,
        fontWeight = fontWeight,
        maxLines = maxLines,
        softWrap = softWrap,
        overflow = overflow
    )
}

@Composable
fun HeadingLarge2(
    modifier: Modifier = Modifier,
    text: String = "Text String",
    @StringRes textResources: Int? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    fontWeight: FontWeight? = FontWeight.Normal,
    softWrap: Boolean = true,
    textAlign: TextAlign = TextAlign.Start,
    color: Color = ThemeDS.colors.black,
) {
    val textValue = textResources?.let { stringResource(id = textResources) } ?: text
    Text(
        modifier = modifier,
        text = textValue,
        textAlign = textAlign,
        style = ThemeDS.typography.headingLarge2,
        color = color,
        fontWeight = fontWeight,
        maxLines = maxLines,
        softWrap = softWrap,
        overflow = overflow
    )
}

@Composable
fun HeadingLarge1(
    modifier: Modifier = Modifier,
    text: String = "Text String",
    @StringRes textResources: Int? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    fontWeight: FontWeight? = FontWeight.Normal,
    softWrap: Boolean = true,
    textAlign: TextAlign = TextAlign.Start,
    color: Color = ThemeDS.colors.black,
) {
    val textValue = textResources?.let { stringResource(id = textResources) } ?: text
    Text(
        modifier = modifier,
        text = textValue,
        textAlign = textAlign,
        style = ThemeDS.typography.headingLarge1,
        color = color,
        fontWeight = fontWeight,
        maxLines = maxLines,
        softWrap = softWrap,
        overflow = overflow
    )
}

@Composable
fun HeadingMedium(
    modifier: Modifier = Modifier,
    text: String = "Text String",
    @StringRes textResources: Int? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    fontWeight: FontWeight? = FontWeight.Normal,
    softWrap: Boolean = true,
    textAlign: TextAlign = TextAlign.Start,
    color: Color = ThemeDS.colors.black,
) {
    val textValue = textResources?.let { stringResource(id = textResources) } ?: text
    Text(
        modifier = modifier,
        text = textValue,
        textAlign = textAlign,
        style = ThemeDS.typography.headingMedium,
        color = color,
        fontWeight = fontWeight,
        maxLines = maxLines,
        softWrap = softWrap,
        overflow = overflow
    )
}

@Composable
fun HeadingSmall(
    modifier: Modifier = Modifier,
    text: String = "Text String",
    @StringRes textResources: Int? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    fontWeight: FontWeight? = FontWeight.Normal,
    softWrap: Boolean = true,
    textAlign: TextAlign = TextAlign.Start,
    color: Color = ThemeDS.colors.black,
) {
    val textValue = textResources?.let { stringResource(id = textResources) } ?: text
    Text(
        modifier = modifier,
        text = textValue,
        textAlign = textAlign,
        style = ThemeDS.typography.headingSmall,
        color = color,
        fontWeight = fontWeight,
        maxLines = maxLines,
        softWrap = softWrap,
        overflow = overflow
    )
}

@Composable
fun HeadingXSmall(
    modifier: Modifier = Modifier,
    text: String = "Text String",
    @StringRes textResources: Int? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    fontWeight: FontWeight? = FontWeight.Normal,
    softWrap: Boolean = true,
    textAlign: TextAlign = TextAlign.Start,
    color: Color = ThemeDS.colors.black,
) {
    val textValue = textResources?.let { stringResource(id = textResources) } ?: text
    Text(
        modifier = modifier,
        text = textValue,
        textAlign = textAlign,
        style = ThemeDS.typography.headingXSmall,
        color = color,
        fontWeight = fontWeight,
        maxLines = maxLines,
        softWrap = softWrap,
        overflow = overflow
    )
}

@Composable
fun BodyMedium(
    modifier: Modifier = Modifier,
    text: String = "Text String",
    @StringRes textResources: Int? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    fontWeight: FontWeight? = FontWeight.Normal,
    softWrap: Boolean = true,
    textAlign: TextAlign = TextAlign.Start,
    color: Color = ThemeDS.colors.black,
) {
    val textValue = textResources?.let { stringResource(id = textResources) } ?: text
    Text(
        modifier = modifier,
        text = textValue,
        textAlign = textAlign,
        style = ThemeDS.typography.bodyMedium,
        color = color,
        fontWeight = fontWeight,
        maxLines = maxLines,
        softWrap = softWrap,
        overflow = overflow
    )
}

@Composable
fun BodySmall(
    modifier: Modifier = Modifier,
    text: String = "Text String",
    @StringRes textResources: Int? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    fontWeight: FontWeight? = FontWeight.Normal,
    softWrap: Boolean = true,
    textAlign: TextAlign = TextAlign.Start,
    color: Color = ThemeDS.colors.black,
) {
    val textValue = textResources?.let { stringResource(id = textResources) } ?: text
    Text(
        modifier = modifier,
        text = textValue,
        textAlign = textAlign,
        style = ThemeDS.typography.bodySmall,
        color = color,
        fontWeight = fontWeight,
        maxLines = maxLines,
        softWrap = softWrap,
        overflow = overflow
    )
}

@Composable
fun BodyXSmall(
    modifier: Modifier = Modifier,
    text: String = "Text String",
    @StringRes textResources: Int? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    fontWeight: FontWeight? = FontWeight.Normal,
    softWrap: Boolean = true,
    textAlign: TextAlign = TextAlign.Start,
    color: Color = ThemeDS.colors.black,
) {
    val textValue = textResources?.let { stringResource(id = textResources) } ?: text
    Text(
        modifier = modifier,
        text = textValue,
        textAlign = textAlign,
        style = ThemeDS.typography.bodyXSmall,
        color = color,
        fontWeight = fontWeight,
        maxLines = maxLines,
        softWrap = softWrap,
        overflow = overflow
    )
}

@Composable
fun BodySpacedM(
    modifier: Modifier = Modifier,
    text: String = "Text String",
    @StringRes textResources: Int? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    fontWeight: FontWeight? = FontWeight.Normal,
    softWrap: Boolean = true,
    textAlign: TextAlign = TextAlign.Start,
    color: Color = ThemeDS.colors.black,
) {
    val textValue = textResources?.let { stringResource(id = textResources) } ?: text
    Text(
        modifier = modifier,
        text = textValue,
        textAlign = textAlign,
        style = ThemeDS.typography.bodySpacedM,
        color = color,
        fontWeight = fontWeight,
        maxLines = maxLines,
        softWrap = softWrap,
        overflow = overflow
    )
}

@Composable
fun BodySpacedS(
    modifier: Modifier = Modifier,
    text: String = "Text String",
    @StringRes textResources: Int? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    fontWeight: FontWeight? = FontWeight.Normal,
    softWrap: Boolean = true,
    textAlign: TextAlign = TextAlign.Start,
    color: Color = ThemeDS.colors.black,
) {
    val textValue = textResources?.let { stringResource(id = textResources) } ?: text
    Text(
        modifier = modifier,
        text = textValue,
        textAlign = textAlign,
        style = ThemeDS.typography.bodySpacedS,
        color = color,
        fontWeight = fontWeight,
        maxLines = maxLines,
        softWrap = softWrap,
        overflow = overflow
    )
}

@Composable
fun BodySpacedXS(
    modifier: Modifier = Modifier,
    text: String = "Text String",
    @StringRes textResources: Int? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    fontWeight: FontWeight? = FontWeight.Normal,
    softWrap: Boolean = true,
    textAlign: TextAlign = TextAlign.Start,
    color: Color = ThemeDS.colors.black,
) {
    val textValue = textResources?.let { stringResource(id = textResources) } ?: text
    Text(
        modifier = modifier,
        text = textValue,
        textAlign = textAlign,
        style = ThemeDS.typography.bodySpacedXS,
        color = color,
        fontWeight = fontWeight,
        maxLines = maxLines,
        softWrap = softWrap,
        overflow = overflow
    )
}

@Preview
@Composable
private fun PTextPreview() {
    MultiSelectionGestureAppTheme {
        PText(modifier = Modifier, text = "Text PText")
    }
}

@Preview
@Composable
private fun HeadingLarge4Preview() {
    MultiSelectionGestureAppTheme {
        HeadingLarge4(
            modifier = Modifier,
            text = "Text HeadingLarge4"
        )
    }
}

@Preview
@Composable
private fun HeadingLarge3Preview() {
    MultiSelectionGestureAppTheme {
        HeadingLarge3(
            modifier = Modifier,
            text = "Text HeadingLarge3"
        )
    }
}

@Preview
@Composable
private fun HeadingLarge2Preview() {
    MultiSelectionGestureAppTheme {
        HeadingLarge2(
            modifier = Modifier,
            text = "Text HeadingLarge2"
        )
    }
}

@Preview
@Composable
private fun HeadingLarge1Preview() {
    MultiSelectionGestureAppTheme {
        HeadingLarge1(
            modifier = Modifier,
            text = "Text HeadingLarge1"
        )
    }
}

@Preview
@Composable
private fun HeadingMediumPreview() {
    MultiSelectionGestureAppTheme {
        HeadingMedium(
            modifier = Modifier,
            text = "Text HeadingMedium"
        )
    }
}

@Preview
@Composable
private fun HeadingSmallPreview() {
    MultiSelectionGestureAppTheme {
        HeadingSmall(
            modifier = Modifier,
            text = "Text HeadingSmall"
        )
    }
}

@Preview
@Composable
private fun HeadingXSmallPreview() {
    MultiSelectionGestureAppTheme {
        HeadingXSmall(
            modifier = Modifier,
            text = "Text HeadingXSmall"
        )
    }
}

@Preview
@Composable
private fun BodyMediumPreview() {
    MultiSelectionGestureAppTheme {
        BodyMedium(
            modifier = Modifier,
            text = "Text BodyMedium"
        )
    }
}

@Preview
@Composable
private fun BodySmallPreview() {
    MultiSelectionGestureAppTheme {
        BodySmall(
            modifier = Modifier,
            text = "Text BodySmall"
        )
    }
}

@Preview
@Composable
private fun BodyXSmallPreview() {
    MultiSelectionGestureAppTheme {
        BodyXSmall(
            modifier = Modifier,
            text = "Text BodyXSmall"
        )
    }
}

@Preview
@Composable
private fun BodySpacedMPreview() {
    MultiSelectionGestureAppTheme {
        BodySpacedM(
            modifier = Modifier,
            text = "Text BodySpacedM"
        )
    }
}

@Preview
@Composable
private fun BodySpacedSPreview() {
    MultiSelectionGestureAppTheme {
        BodySpacedS(
            modifier = Modifier,
            text = "Text BodySpacedS"
        )
    }
}

@Preview
@Composable
private fun BodySpacedXSPreview() {
    MultiSelectionGestureAppTheme {
        BodySpacedXS(
            modifier = Modifier,
            text = "Text BodySpacedXS"
        )
    }
}
