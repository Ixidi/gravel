package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class JungleWallSign(
	val facing: FullFacing,
	val waterlogged: Boolean
) : BlockState(BlockType.JUNGLE_WALL_SIGN)
