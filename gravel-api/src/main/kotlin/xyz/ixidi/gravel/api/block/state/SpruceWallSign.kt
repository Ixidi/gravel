package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class SpruceWallSign(
	val facing: FullFacing,
	val waterlogged: Boolean
) : BlockState(BlockType.SPRUCE_WALL_SIGN)
