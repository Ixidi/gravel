package xyz.ixidi.gravel.protocol.packet.play.server

import xyz.ixidi.gravel.api.packet.Packet

interface ServerChangeGameStatePacket : Packet {

    var reason: UByte
    var value: Float

}