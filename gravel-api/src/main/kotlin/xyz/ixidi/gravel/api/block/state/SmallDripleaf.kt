package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing
import xyz.ixidi.gravel.api.block.state.properties.DoorHalf

data class SmallDripleaf(
	val facing: FullFacing,
	val half: DoorHalf,
	val waterlogged: Boolean
) : BlockState(BlockType.SMALL_DRIPLEAF)
