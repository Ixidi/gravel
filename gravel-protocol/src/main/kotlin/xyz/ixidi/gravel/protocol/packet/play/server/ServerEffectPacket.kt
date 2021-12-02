package xyz.ixidi.gravel.protocol.packet.play.server

import xyz.ixidi.gravel.api.io.Position
import xyz.ixidi.gravel.api.packet.Packet

interface ServerEffectPacket : Packet {

    var effectId: Int
    var location: Position
    var data: Int
    var disableRelativeVolume: Boolean

}