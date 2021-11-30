package xyz.ixidi.gravel.protocol.packet.play.client

import xyz.ixidi.gravel.api.packet.Packet

interface ClientHeldItemChangePacket : Packet {

    var slot: Short

}