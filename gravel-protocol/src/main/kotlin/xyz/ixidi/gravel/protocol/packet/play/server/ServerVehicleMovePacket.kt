package xyz.ixidi.gravel.protocol.packet.play.server

import xyz.ixidi.gravel.api.packet.Packet

interface ServerVehicleMovePacket : Packet {

    var x: Double
    var y: Double
    var z: Double
    var yaw: Float
    var pitch: Float

}