package xyz.ixidi.gravel.protocol.packet.play.server

import xyz.ixidi.gravel.api.io.Position
import xyz.ixidi.gravel.api.packet.Packet

interface ServerAcknowledgePlayerDiggingPacket : Packet {

    enum class Status(val value: Int) {
        STARTED(0),
        CANCELLED(1),
        FINISHED(2)
    }

    var location: Position
    var block: Int
    var status: Status
    var successful: Boolean

}