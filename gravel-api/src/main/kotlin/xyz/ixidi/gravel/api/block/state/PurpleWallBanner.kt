package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class PurpleWallBanner(
	val facing: FullFacing
) : BlockState(BlockType.PURPLE_WALL_BANNER)
