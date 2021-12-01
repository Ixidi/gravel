package xyz.ixidi.gravel.protocol.packet.play.server

import xyz.ixidi.gravel.api.packet.Packet

interface ServerSpawnExperienceOrbPacket : Packet {

    var entityId: Int
    var x: Double
    var y: Double
    var z: Double
    var cound: Short

}