package xyz.ixidi.gravel.bot.service

import kotlinx.coroutines.delay
import xyz.ixidi.gravel.bot.GravelBot
import xyz.ixidi.gravel.protocol.packet.play.client.ClientPlayerPositionAndRotationPacket

class PositionSendService(
    private val bot: GravelBot
) : Service() {

    override suspend fun start() {
        while (true) {
            val pos = bot.position
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