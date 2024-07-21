package com.arcadone.multiselectiongesture.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color

@Immutable
data class DesignColorPalette(
    val colorPrimary: Color,
    val colorPrimaryVariant: Color,
    val colorOnPrimary: Color,
    val colorSecondary: Color,
    val colorSecondaryVariant: Color,
    val colorOnSecondary: Color,
    val colorTertiary: Color,
    val colorTertiaryVariant: Color,
    val colorOnTertiary: Color,
    val colorBackground: Color,
    val colorSurface: Color,
    val colorOnBackground: Color,
    val colorOnSurface: Color,
    val colorBlack: Color,
    val colorWhite: Color,
    val colorAccent1: Color,
    val colorAccent2: Color,
    val colorAccent3: Color
)

@Immutable
data class DesignColors(
    val primary: Color,
    val primaryVariant: Color,
    val onPrimary: Color,
    val secondary: Color,
    val secondaryVariant: Color,
    val onSecondary: Color,
    val tertiary: Color,
    val tertiaryVariant: Color,
    val onTertiary: Color,
    val background: Color,
    val surface: Color,
    val onBackground: Color,
    val onSurface: Color,
    val black: Color,
    val white: Color,
    val accent1: Color,
    val accent2: Color,
    val accent3: Color
)

fun designTheme(palette: DesignColorPalette) = DesignColors(
    primary = palette.colorPrimary,
    primaryVariant = palette.colorPrimaryVariant,
    onPrimary = palette.colorOnPrimary,
    secondary = palette.colorSecondary,
    secondaryVariant = palette.colorSecondaryVariant,
    onSecondary = palette.colorOnSecondary,
    tertiary = palette.colorTertiary,
    tertiaryVariant = palette.colorTertiaryVariant,
    onTertiary = palette.colorOnTertiary,
    background = palette.colorBackground,
    surface = palette.colorSurface,
    onBackground = palette.colorOnBackground,
    onSurface = palette.colorOnSurface,
    black = palette.colorBlack,
    white = palette.colorWhite,
    accent1 = palette.colorAccent1,
    accent2 = palette.colorAccent2,
    accent3 = palette.colorAccent3
)

fun darkDesignTheme(palette: DesignColorPalette) = DesignColors(
    primary = palette.colorPrimary,
    primaryVariant = palette.colorPrimaryVariant,
    onPrimary = palette.colorOnPrimary,
    secondary = palette.colorSecondary,
    secondaryVariant = palette.colorSecondaryVariant,
    onSecondary = palette.colorOnSecondary,
    tertiary = palette.colorTertiary,
    tertiaryVariant = palette.colorTertiaryVariant,
    onTertiary = palette.colorOnTertiary,
    background = palette.colorBackground,
    surface = palette.colorSurface,
    onBackground = palette.colorOnBackground,
    onSurface = palette.colorOnSurface,
    black = palette.colorBlack,
    white = palette.colorWhite,
    accent1 = palette.colorAccent1,
    accent2 = palette.colorAccent2,
    accent3 = palette.colorAccent3
)

val darkAppPalette = DesignColorPalette(
    colorPrimary = Color(0xFF1E88E5),  // Blue
    colorPrimaryVariant = Color(0xFF1565C0),  // Dark Blue
    colorOnPrimary = Color(0xFFFFFFFF),  // White

    colorSecondary = Color(0xFFE53935),  // Red
    colorSecondaryVariant = Color(0xFFC62828),  // Dark Red
    colorOnSecondary = Color(0xFFFFFFFF),  // White

    colorTertiary = Color(0xFF43A047),  // Green
    colorTertiaryVariant = Color(0xFF2E7D32),  // Dark Green
    colorOnTertiary = Color(0xFFFFFFFF),  // White

    colorBackground = Color(0xFFFFFFFF),  // White
    colorSurface = Color(0xFFFFFFFF),  // White
    colorOnBackground = Color(0xFF000000),  // Black

    colorOnSurface = Color(0xFF000000),  // Black
    colorBlack = Color(0xFF000000),  // Black
    colorWhite = Color(0xFFFFFFFF),  // White

    colorAccent1 = Color(0xFFFFA000),  // Amber
    colorAccent2 = Color(0xFFFFC107),  // Yellow
    colorAccent3 = Color(0xFFFFD54F),  // Light Yellow
)

val defaultAppPalette = DesignColorPalette(
    colorPrimary = Color(0xFF90CAF9),  // Light Blue
    colorPrimaryVariant = Color(0xFF1565C0),  // Darker Blue
    colorOnPrimary = Color(0xFF000000),  // Black

    colorSecondary = Color(0xFFEF9A9A),  // Light Red
    colorSecondaryVariant = Color(0xFFD32F2F),  // Darker Red
    colorOnSecondary = Color(0xFF000000),  // Black

    colorTertiary = Color(0xFFA5D6A7),  // Light Green
    colorTertiaryVariant = Color(0xFF388E3C),  // Darker Green
    colorOnTertiary = Color(0xFF000000),  // Black

    colorBackground = Color(0xFF121212),  // Dark Gray
    colorSurface = Color(0xFF1E1E1E),  // Slightly lighter Dark Gray
    colorOnBackground = Color(0xFFFFFFFF),  // White
    colorOnSurface = Color(0xFFFFFFFF),  // White

    colorBlack = Color(0xFF000000),  // Black
    colorWhite = Color(0xFFFFFFFF),  // White

    colorAccent1 = Color(0xFFFFA726),  // Light Amber
    colorAccent2 = Color(0xFFFFC107),  // Yellow
    colorAccent3 = Color(0xFFFFD54F),  // Light Yellow
)