package xyz.ixidi.gravel.core.io.component

import io.ktor.utils.io.ByteReadChannel
import xyz.ixidi.gravel.api.component.TextComponent
import xyz.ixidi.gravel.core.component.LegacyColors
import xyz.ixidi.gravel.core.component.TextComponentImpl
import xyz.ixidi.gravel.core.component.X11Colors
import xyz.ixidi.gravel.core.io.readString
import java.awt.Color as AWTColor
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import xyz.ixidi.gravel.api.component.toGravelColor

suspend fun ByteReadChannel.readTextComponent(maxJsonLength: Int): TextComponent {

    val json = readString()
    return Json.decodeFromString<SerializableTextComponent>(json).parse()
}

private fun SerializableTextComponent.parse(): TextComponent {
    val extra = extra?.map { it.parse() } ?: emptyList()

    val c = if (color != null) {
        LegacyColors.values().firstOrNull { color == it.colorName || color == "${it.colorCode}" }
            ?: kotlin.runCatching { AWTColor.decode(this.color) }.getOrNull()?.toGravelColor()
            ?: X11Colors.getByName(color)
            ?: LegacyColors.WHITE
    } else LegacyColors.WHITE

    return TextComponentImpl(
        extra = extra,
        text = text,
        translate = translate,
        isBold = bold,
        isItalic = italic,
        isUnderlined = underlined,
        isStrikethrough = strikethrough,
        isObfuscated = obfuscated,
        color = c
    )
}