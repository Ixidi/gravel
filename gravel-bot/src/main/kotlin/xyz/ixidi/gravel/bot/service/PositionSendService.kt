package xyz.ixidi.gravel.bot.servicex

import kotlinx.coroutines.delay
import xyz.ixidi.gravel.bot.GravelBot
import xyz.ixidi.gravel.protocol.packet.play.client.ClientPlayerPositionAndRotationPacket

class PositionSendServiceX(
    private val bot: GravelBot
) : ServiceX() {

    override suspend fun start() {
        while (true) {
            val pos = bot.location
            bot.send<ClientPlayerPositionAndRotationPacket> {
                x = pos.x
                feetY = pos.y
                z = pos.z
                yaw = pos.yaw
                pitch = pos.pitch
                onGround = pos.isGrounded
            }
            delay(100)
        }
    }
}