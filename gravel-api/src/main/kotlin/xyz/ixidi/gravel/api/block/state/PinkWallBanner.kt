package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class PinkWallBanner(
	val facing: FullFacing
) : BlockState(BlockType.PINK_WALL_BANNER)
