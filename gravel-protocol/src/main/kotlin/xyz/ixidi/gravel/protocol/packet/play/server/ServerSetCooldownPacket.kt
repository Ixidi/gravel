package xyz.ixidi.gravel.protocol.packet.play.server

import xyz.ixidi.gravel.api.packet.Packet

interface ServerSetCooldownPacket : Packet {

    var itemId: Int
    var cooldownTicks: Int

}