package xyz.ixidi.gravel.api.io

@JvmInline
value class Angle(val value: Byte) {

    fun toFloat() = value / 360f

}

fun Float.toAngle() = Angle((this * 360).toInt().toByte())