package xyz.ixidi.gravel.api.component

interface TextComponent {

    val extra: List<TextComponent>

    val text: String
    val translate: String?
    val isBold: Boolean
    val isItalic: Boolean
    val isUnderlined: Boolean
    val isStrikethrough: Boolean
    val isObfuscated: Boolean
    val color: Color

    //TODO hover and click events

}

fun TextComponent.rawString(): String = buildString {
    append(text)
    if (extra.isNotEmpty()) {
        append(extra.joinToString("") { it.rawString() })
    }
}