package xyz.ixidi.gravel.api.nbt

data class LongTag(
    override val name: String,
    val value: Long
) : Tag