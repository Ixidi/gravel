package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class DarkOakWallSign(
	val facing: FullFacing,
	val waterlogged: Boolean
) : BlockState(BlockType.DARK_OAK_WALL_SIGN)
