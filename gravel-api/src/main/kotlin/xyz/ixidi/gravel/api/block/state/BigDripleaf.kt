package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing
import xyz.ixidi.gravel.api.block.state.properties.Tilt

data class BigDripleaf(
	val facing: FullFacing,
	val tilt: Tilt,
	val waterlogged: Boolean
) : BlockState(BlockType.BIG_DRIPLEAF)
