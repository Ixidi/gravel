package xyz.ixidi.gravel.v1_17_1.client

import xyz.ixidi.gravel.protocol.misc.BlockFace
import xyz.ixidi.gravel.protocol.misc.PositionData
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.mapped
import xyz.ixidi.gravel.protocol.packet.play.client.ClientPlayerBlockPlacementPacket

class ClientPlayerBlockPlacementPacketImpl : StandardPacket(), ClientPlayerBlockPlacementPacket {

    override var mainHand: Boolean by varInt().mapped(
        convertFrom = { if (it) 0 else 1 },
        convertTo = {
            when (it) {
                0 -> true
                1 -> false
                else -> throw Exception("Unknown id.")
            }
        }
    )

    override var blockPosition: PositionData by position()

    override var blockFace: BlockFace by varInt().mapped<Int, BlockFace>(
        convertFrom = {
            when (it) {
                BlockFace.BOTTOM -> 0
                BlockFace.TOP -> 1
                BlockFace.NORTH -> 2
                BlockFace.SOUTH -> 3
                BlockFace.WEST -> 4
                BlockFace.EAST -> 5
            }
        },
        convertTo = {
            when (it) {
                0 -> BlockFace.BOTTOM
                1 -> BlockFace.TOP
                2 -> BlockFace.NORTH
                3 -> BlockFace.SOUTH
                4 -> BlockFace.WEST
                5 -> BlockFace.EAST
                else -> throw Exception("Unknown id.")
            }
        }
    )
    override var cursorPositionX: Float by float()
    override var cursorPositionY: Float by float()
    override var cursorPositionZ: Float by float()
    override var insideBlock: Boolean by boolean()

}