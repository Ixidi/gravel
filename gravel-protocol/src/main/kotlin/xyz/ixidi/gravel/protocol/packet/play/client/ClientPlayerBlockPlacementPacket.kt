package xyz.ixidi.gravel.protocol.packet.play.client

import xyz.ixidi.gravel.api.packet.Packet
import xyz.ixidi.gravel.protocol.misc.BlockFace

interface ClientPlayerBlockPlacementPacket : Packet {

    var mainHand: Boolean
    var blockPosition: PositionData
    var blockFace: BlockFace
    var cursorPositionX: Float
    var cursorPositionY: Float
    var cursorPositionZ: Float
    var insideBlock: Boolean

}