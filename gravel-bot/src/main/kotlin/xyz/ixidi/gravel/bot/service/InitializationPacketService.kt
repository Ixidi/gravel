package xyz.ixidi.gravel.bot.service

import xyz.ixidi.gravel.api.misc.MainHand
import xyz.ixidi.gravel.bot.entity.PlayerEntity
import xyz.ixidi.gravel.bot.location.Location
import xyz.ixidi.gravel.bot.location.Vector
import xyz.ixidi.gravel.protocol.packet.play.client.ClientPluginMessagePacket
import xyz.ixidi.gravel.protocol.packet.play.client.ClientSettingsPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerJoinGamePacket

class JoinGamePacketService : Service() {

    override fun ServiceInitializer.init() {
        once<ServerJoinGamePacket> {
            bot.selfEntity = PlayerEntity(entityId, Location(0.0, 0.0, 0.0, 0f, 0f, false), 0f, Vector(0.0, 0.0, 0.0), bot.self)
            bot.entityManager.addEntity(bot.selfEntity)
            bot.send<ClientPluginMessagePacket> {
                channel = "minecraft:vanilla"
                data = "vanilla".toByteArray()
            }
            bot.send<ClientSettingsPacket> {
                locale = "en_GB"
                viewDistance = 5
                chatMode = ClientSettingsPacket.ChatMode.ENABLED
                chatColors = true
                displayedSkinPart = 0.toUByte()
                mainHand = MainHand.RIGHT
                disableTextFiltering = true
            }
        }
    }


}