package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class BlackWallBanner(
	val facing: FullFacing
) : BlockState(BlockType.BLACK_WALL_BANNER)
