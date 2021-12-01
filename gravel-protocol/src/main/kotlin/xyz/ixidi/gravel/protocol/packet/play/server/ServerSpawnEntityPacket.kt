package xyz.ixidi.gravel.protocol.packet.play.server

import xyz.ixidi.gravel.api.io.Angle
import xyz.ixidi.gravel.api.packet.Packet
import java.util.UUID

interface ServerSpawnEntityPacket : Packet {

    var entityId: Int
    var objectUUID: UUID
    var type: Int //change to enum
    var x: Double
    var y: Double
    var z: Double
    var pitch: Angle
    var yaw: Angle
    var data: Int
    var velocityX: Short
    var velocityY: Short
    var velocityZ: Short

}