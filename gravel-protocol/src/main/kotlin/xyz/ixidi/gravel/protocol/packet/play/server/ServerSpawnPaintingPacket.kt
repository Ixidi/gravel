package xyz.ixidi.gravel.protocol.packet.play.server

import xyz.ixidi.gravel.api.io.Position
import xyz.ixidi.gravel.api.packet.Packet
import java.util.UUID

interface ServerSpawnPaintingPacket : Packet {

    enum class Direction {
        NORTH,
        SOUTH,
        WEST,
        EAST
    }

    var entityId: Int
    var entityUUID: UUID
    val motive: Int
    val location: Position
    val direction: Direction

}