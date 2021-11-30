package xyz.ixidi.gravel.core.component

import xyz.ixidi.gravel.api.component.Color
import xyz.ixidi.gravel.api.component.TextComponent

internal data class TextComponentImpl(
    override val extra: List<TextComponent>,
    override val text: String,
    override val translate: String?,
    override val isBold: Boolean,
    override val isItalic: Boolean,
    override val isUnderlined: Boolean,
    override val isStrikethrough: Boolean,
    override val isObfuscated: Boolean,
    override val color: Color
) : TextComponent