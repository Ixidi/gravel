package xyz.ixidi.gravel.protocol.packet.play.server

import xyz.ixidi.gravel.api.packet.Packet

interface ServerUnloadChunkPacket : Packet {

    var chunkX: Int
    var chunkZ: Int

}