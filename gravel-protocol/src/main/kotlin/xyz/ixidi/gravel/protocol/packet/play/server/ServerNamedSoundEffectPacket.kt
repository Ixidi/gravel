package xyz.ixidi.gravel.protocol.packet.play.server

import xyz.ixidi.gravel.api.io.Identifier
import xyz.ixidi.gravel.api.packet.Packet

interface ServerNamedSoundEffectPacket : Packet {

    var soundName: Identifier
    var soundCategory: Int
    var effectPositionX: Int
    var effectPositionY: Int
    var effectPositionZ: Int
    var volume: Float
    var pitch: Float

}