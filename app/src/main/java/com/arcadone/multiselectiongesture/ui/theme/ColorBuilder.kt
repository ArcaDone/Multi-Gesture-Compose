package com.arcadone.multiselectiongesture.ui.theme

import com.arcadone.multiselectiongesture.ui.theme.DesignColors

interface ColorsBuilder {
    fun build(
        isDark: Boolean
    ): DesignColors
}