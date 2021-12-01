package xyz.ixidi.gravel.protocol.packet.play.server

import xyz.ixidi.gravel.api.io.Angle
import xyz.ixidi.gravel.api.packet.Packet
import java.util.UUID

interface ServerSpawnPlayerPacket : Packet {

    var entityId: Int
    var playerUUID: UUID
    var x: Double
    var y: Double
    var z: Double
    var yaw: Angle
    var pitch: Angle

}