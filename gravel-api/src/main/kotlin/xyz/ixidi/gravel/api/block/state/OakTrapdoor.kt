package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing
import xyz.ixidi.gravel.api.block.state.properties.HalfPosition

data class OakTrapdoor(
	val facing: FullFacing,
	val half: HalfPosition,
	val open: Boolean,
	val powered: Boolean,
	val waterlogged: Boolean
) : BlockState(BlockType.OAK_TRAPDOOR)
