package xyz.ixidi.gravel.protocol.packet.play.server

import xyz.ixidi.gravel.api.packet.Packet

interface ServerCloseWindowPacket : Packet {

    var windowId: UByte

}