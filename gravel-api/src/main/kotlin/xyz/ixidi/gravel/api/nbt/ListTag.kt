package xyz.ixidi.gravel.api.nbt

data class ListTag<T : Tag>(
    override val name: String,
    val values: List<T>
) : Tag