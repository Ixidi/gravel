package xyz.ixidi.gravel.api.nbt

data class StringTag(
    override val name: String,
    val value: String
) : Tag