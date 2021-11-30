package xyz.ixidi.gravel.api.nbt

data class IntTag(
    override val name: String,
    val value: Int
) : Tag