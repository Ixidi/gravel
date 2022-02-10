package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class RedWallBanner(
	val facing: FullFacing
) : BlockState(BlockType.RED_WALL_BANNER)
