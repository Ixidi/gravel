package xyz.ixidi.gravel.api.nbt

data class LongArrayTag(
    override val name: String,
    val value: LongArray
) : Tag {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as LongArrayTag

        if (name != other.name) return false
        if (!value.contentEquals(other.value)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + value.contentHashCode()
        return result
    }

}