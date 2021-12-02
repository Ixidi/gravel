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

}