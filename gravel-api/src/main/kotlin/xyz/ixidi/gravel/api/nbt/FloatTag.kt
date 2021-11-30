package xyz.ixidi.gravel.api.nbt

data class FloatTag(
    override val name: String,
    val value: Float
) : Tag