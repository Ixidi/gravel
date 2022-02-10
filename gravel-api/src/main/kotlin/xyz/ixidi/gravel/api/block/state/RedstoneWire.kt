package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.RedStoneDirection

data class RedstoneWire(
	val east: RedStoneDirection,
	val north: RedStoneDirection,
	val power: Int,
	val south: RedStoneDirection,
	val west: RedStoneDirection
) : BlockState(BlockType.REDSTONE_WIRE)
