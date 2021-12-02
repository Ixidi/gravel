package xyz.ixidi.gravel.protocol.packet.play.server

import xyz.ixidi.gravel.api.packet.Packet

interface ServerInitializeWorldBorderPacket : Packet {

    var x: Double
    var y: Double
    var z: Double
    var oldDiameter: Double
    var newDiameter: Double
    var speed: Long
    var portalTeleportBoundary: Int
    var warningBlocks: Int
    var warningTime: Int

}