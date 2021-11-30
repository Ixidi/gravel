package xyz.ixidi.gravel.api.nbt

data class DoubleTag(
    override val name: String,
    val value: Double
) : Tag