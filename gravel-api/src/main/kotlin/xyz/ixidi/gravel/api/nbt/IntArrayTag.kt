package xyz.ixidi.gravel.api.nbt

data class IntArrayTag(
    override val name: String,
    val value: IntArray
) : Tag {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as IntArrayTag

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