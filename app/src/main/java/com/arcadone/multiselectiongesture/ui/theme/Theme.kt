package com.arcadone.multiselectiongesture.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun MultiSelectionGestureAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    colorBuilder: ColorsBuilder = ColorsBuilderImpl(),
    typography: DesignTypography? = null,
    spacing: DesignSpacing? = null,
    content: @Composable () -> Unit
) {

    val systemUiController = rememberSystemUiController()
    val localTypography = typography ?: defaultDesignTypography
    val localSpacing = spacing ?: defaultSpacing
    SideEffect {
        systemUiController.setNavigationBarColor(
            color = colorBuilder.build(darkTheme).white
        )
        systemUiController.setStatusBarColor(
            color = colorBuilder.build(darkTheme).white
        )
    }
    CompositionLocalProvider(
        LocalDesignColors provides colorBuilder.build(darkTheme),
        LocalDesignTypography provides localTypography,
        LocalDesignSpacing provides localSpacing
    ) {
        MaterialTheme(
            content = content,
            shapes = Shapes,
            colorScheme = MaterialTheme.colorScheme.copy(primary = ThemeDS.colors.white)
        )
    }
}

val LocalDesignColors = staticCompositionLocalOf {
    DesignColors(
        primary = Color.Unspecified,
        primaryVariant = Color.Unspecified,
        onPrimary = Color.Unspecified,
        secondary = Color.Unspecified,
        secondaryVariant = Color.Unspecified,
        onSecondary = Color.Unspecified,
        tertiary = Color.Unspecified,
        tertiaryVariant = Color.Unspecified,
        onTertiary = Color.Unspecified,
        background = Color.Unspecified,
        surface = Color.Unspecified,
        onBackground = Color.Unspecified,
        onSurface = Color.Unspecified,
        black = Color.Unspecified,
        white = Color.Unspecified,
        accent1 = Color.Unspecified,
        accent2 = Color.Unspecified,
        accent3 = Color.Unspecified
    )
}

val LocalDesignTypography = staticCompositionLocalOf {
    DesignTypography(
        headingLarge3 = TextStyle.Default,
        headingLarge4 = TextStyle.Default,
        headingLarge2 = TextStyle.Default,
        headingMedium = TextStyle.Default,
        headingSmall = TextStyle.Default,
        headingXSmall = TextStyle.Default,
        bodyMedium = TextStyle.Default,
        bodyXSmall = TextStyle.Default,
        bodySpacedM = TextStyle.Default,
        bodySpacedS = TextStyle.Default,
        bodySpacedXS = TextStyle.Default,
        bodySmall = TextStyle.Default,
        headingLarge1 = TextStyle.Default
    )
}

val LocalDesignSpacing = staticCompositionLocalOf {
    DesignSpacing(
        space1 = Dp.Unspecified,
        space2 = Dp.Unspecified,
        space3 = Dp.Unspecified,
        space4 = Dp.Unspecified,
        space5 = Dp.Unspecified,
        space6 = Dp.Unspecified,
        space7 = Dp.Unspecified,
        space8 = Dp.Unspecified,
        space9 = Dp.Unspecified,
        space10 = Dp.Unspecified,
        space11 = Dp.Unspecified,
        space12 = Dp.Unspecified,
        space13 = Dp.Unspecified,
        space14 = Dp.Unspecified,
        space16 = Dp.Unspecified,
        space18 = Dp.Unspecified,
        space20 = Dp.Unspecified,
        space22 = Dp.Unspecified,
        space24 = Dp.Unspecified,
        space25 = Dp.Unspecified,
        space26 = Dp.Unspecified,
        space28 = Dp.Unspecified,
        space30 = Dp.Unspecified,
        space32 = Dp.Unspecified,
        space40 = Dp.Unspecified,
        space44 = Dp.Unspecified,
        space48 = Dp.Unspecified,
        space50 = Dp.Unspecified,
        space56 = Dp.Unspecified,
        space60 = Dp.Unspecified,
        space70 = Dp.Unspecified,
        space72 = Dp.Unspecified,
        space100 = Dp.Unspecified,
        space120 = Dp.Unspecified,
        space156 = Dp.Unspecified,
    )
}

object ThemeDS {
    val colors: DesignColors
        @Composable
        get() = LocalDesignColors.current
    val typography: DesignTypography
        @Composable
        get() = LocalDesignTypography.current
    val spacing: DesignSpacing
        @Composable
        get() = LocalDesignSpacing.current
}