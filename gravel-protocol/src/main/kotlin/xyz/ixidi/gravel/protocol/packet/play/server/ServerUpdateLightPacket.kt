package xyz.ixidi.gravel.protocol.packet.play.server

import xyz.ixidi.gravel.api.packet.Packet

interface ServerUpdateLightPacket : Packet {

    var chunkX: Int
    var chunkZ: Int
    var trustEdges: Boolean
    var skyLightMask: List<Long>
    var blockLightMask: List<Long>
    var emptySkyLightMask: List<Long>
    var emptyBlockLightMask: List<Long>
    var skyLight: List<List<Long>>
    var blockLight: List<List<Long>>

}