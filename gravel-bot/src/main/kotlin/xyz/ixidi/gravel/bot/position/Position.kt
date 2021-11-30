package xyz.ixidi.gravel.bot.position

data class Position(
    val x: Double,
    val y: Double,
    val z: Double,
    val yaw: Float,
    val pitch: Float,
    val isGrounded: Boolean
)