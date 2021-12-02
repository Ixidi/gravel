package xyz.ixidi.gravel.protocol.packet.play.server

import xyz.ixidi.gravel.api.packet.Packet

interface ServerFacePlayerPacket : Packet {

    enum class LookType {
        FEET,
        EYES
    }

    var lookType: LookType
    var targetX: Double
    var targetY: Double
    var targetZ: Double
    var isEntity: Boolean
    var entityId: Int?
    var entityLookType: LookType?

}