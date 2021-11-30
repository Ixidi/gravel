package xyz.ixidi.gravel.protocol.packet.play.server

import xyz.ixidi.gravel.api.packet.Packet

interface ServerPlayerPositionAndLookPacket : Packet {

    var x: Double
    var y: Double
    var z: Double
    var yaw: Float
    var pitch: Float
    var flags: Byte
    var teleportId: Int
    var dismountVehicle: Boolean

}