package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class BrownWallBanner(
	val facing: FullFacing
) : BlockState(BlockType.BROWN_WALL_BANNER)
