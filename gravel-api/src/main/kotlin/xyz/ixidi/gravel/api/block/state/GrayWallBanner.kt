package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class GrayWallBanner(
	val facing: FullFacing
) : BlockState(BlockType.GRAY_WALL_BANNER)
