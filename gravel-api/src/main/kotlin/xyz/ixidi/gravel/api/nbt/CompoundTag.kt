package xyz.ixidi.gravel.api.nbt

data class CompoundTag(
    override val name: String,
    val tags: List<Tag>
) : Tag