package xyz.ixidi.gravel.protocol.packet.play.server

import xyz.ixidi.gravel.api.component.TextComponent
import xyz.ixidi.gravel.api.packet.Packet

interface ServerDeathCombatEventPacket : Packet {

    var playerId: Int
    var entityId: Int
    var message: TextComponent

}