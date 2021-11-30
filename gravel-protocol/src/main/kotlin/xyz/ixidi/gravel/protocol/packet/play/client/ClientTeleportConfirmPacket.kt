package xyz.ixidi.gravel.protocol.packet.play.client

import xyz.ixidi.gravel.api.packet.Packet

interface ClientTeleportConfirmPacket : Packet {

    var teleportId: Int

}