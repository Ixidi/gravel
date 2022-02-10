package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class CrimsonWallSign(
	val facing: FullFacing,
	val waterlogged: Boolean
) : BlockState(BlockType.CRIMSON_WALL_SIGN)
