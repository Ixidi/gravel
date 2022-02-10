package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class LightGrayWallBanner(
	val facing: FullFacing
) : BlockState(BlockType.LIGHT_GRAY_WALL_BANNER)
