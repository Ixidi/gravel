package xyz.ixidi.gravel.protocol.packet.play.server

import xyz.ixidi.gravel.api.packet.Packet

interface ServerOpenHorseWindowPacket : Packet {

    var windowId: Byte
    var numberOfSlots: Int
    var entityId: Int

}