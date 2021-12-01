package xyz.ixidi.gravel.protocol.packet.play.server

import xyz.ixidi.gravel.api.io.Angle
import xyz.ixidi.gravel.api.packet.Packet
import java.util.UUID

interface ServerSpawnLivingEntityPacket : Packet {

    var entityId: Int
    var entityUUID: UUID
    var type: Int //change to enum
    var x: Double
    var y: Double
    var z: Double
    var pitch: Angle
    var yaw: Angle
    var headPitch: Angle
    var velocityX: Short
    var velocityY: Short
    var velocityZ: Short

}