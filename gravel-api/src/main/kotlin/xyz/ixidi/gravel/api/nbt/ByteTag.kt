package xyz.ixidi.gravel.api.nbt

data class ByteTag(
    override val name: String,
    val value: Byte
) : Tag