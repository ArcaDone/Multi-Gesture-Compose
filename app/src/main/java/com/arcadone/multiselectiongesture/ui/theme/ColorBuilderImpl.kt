package com.arcadone.multiselectiongesture.ui.theme

class ColorsBuilderImpl : ColorsBuilder {
    override fun build(isDark: Boolean) = if (isDark)
        darkDesignTheme(darkAppPalette)
    else
        designTheme(defaultAppPalette)
}