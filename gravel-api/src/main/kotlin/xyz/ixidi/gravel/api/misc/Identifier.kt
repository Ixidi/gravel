package xyz.ixidi.gravel.api.io

class Identifier(
    string: String
) {

    val namespace: String
    val value: String

    init {
        val split = string.split(":", limit = 2)
        namespace = if (split.size == 1) "minecraft" else split[0]
        value = if (split.size == 1) split[0] else split[1]
    }

    override fun toString(): String = "$namespace:$value"

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Identifier

        if (namespace != other.namespace) return false
        if (value != other.value) return false

        return true
    }

    override fun hashCode(): Int {
        var result = namespace.hashCode()
        result = 31 * result + value.hashCode()
        return result
    }


}