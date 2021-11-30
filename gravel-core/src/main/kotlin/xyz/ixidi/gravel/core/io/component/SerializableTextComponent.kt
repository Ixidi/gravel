package xyz.ixidi.gravel.core.io.component

import kotlinx.serialization.Serializable

@Serializable
internal data class SerializableTextComponent(
    val text: String = "",
    val bold: Boolean = false,
    val italic: Boolean = false,
    val underlined: Boolean = false,
    val strikethrough: Boolean = false,
    val translate: String? = null, //TODO use it in impl and api
    val obfuscated: Boolean = false,
    val color: String? = null,
    val extra: List<SerializableTextComponent>? = null,
    val insertion: String? = null,
    val clickEvent: Event? = null,
    val hoverEvent: Event? = null
) {

    @Serializable
    data class Event(
        val action: String,
        val value: String
    )

}