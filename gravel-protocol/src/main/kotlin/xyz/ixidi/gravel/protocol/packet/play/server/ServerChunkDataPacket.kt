package xyz.ixidi.gravel.protocol.packet.play.server

import xyz.ixidi.gravel.api.nbt.CompoundTag
import xyz.ixidi.gravel.api.packet.Packet

interface ServerChunkDataPacket : Packet {

    var chunkX: Int
    var chunkZ: Int
    var primaryBitMask: List<Long>
    var heightmaps: CompoundTag
    var biomes: List<Int>
    val data: ByteArray
    val blockEntities: List<CompoundTag>

}