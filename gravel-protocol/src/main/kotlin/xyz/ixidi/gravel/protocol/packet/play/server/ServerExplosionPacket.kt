package xyz.ixidi.gravel.protocol.packet.play.server

import xyz.ixidi.gravel.api.packet.Packet

interface ServerExplosionPacket : Packet {

    data class Record(
        val x: Byte,
        val y: Byte,
        val z: Byte
    )

    var x: Float
    var y: Float
    var z: Float
    var strength: Float
    var records: List<Record>
    var playerMotionX: Float
    var playerMotionY: Float
    var playerMotionZ: Float

}