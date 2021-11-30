package xyz.ixidi.gravel.api.nbt

data class ShortTag(
    override val name: String,
    val value: Short
) : Tag