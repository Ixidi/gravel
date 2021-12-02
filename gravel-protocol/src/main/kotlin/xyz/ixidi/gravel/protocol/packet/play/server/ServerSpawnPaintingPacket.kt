package xyz.ixidi.gravel.protocol.packet.play.server

import xyz.ixidi.gravel.api.io.Position
import xyz.ixidi.gravel.api.packet.Packet
import java.util.UUID

interface ServerSpawnPaintingPacket : Packet {

    enum class Motive {
        KEBAB,
        AZTEC,
        ALBAN,
        AZTEC_2,
        BOMB,
        PLANT,
        WASTELAND,
        POOL,
        COUR_BET,
        SEA,
        SUNSET,
        CREE_BET,
        WANDERER,
        GRAHAM,
        MATCH,
        BUST,
        STAGE,
        VOID,
        SKULL_AND_ROSES,
        WITHER,
        FIGHTERS,
        POINTER,
        PIG_SCENE,
        BURNING_SKULL,
        SKELETON,
        DONKEY_KONG
    }

    enum class Direction {
        NORTH,
        SOUTH,
        WEST,
        EAST
    }

    var entityId: Int
    var entityUUID: UUID
    val motive: Motive
    val location: Position
    val direction: Direction

}