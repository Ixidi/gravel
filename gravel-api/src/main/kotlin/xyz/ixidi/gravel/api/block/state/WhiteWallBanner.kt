package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class WhiteWallBanner(
	val facing: FullFacing
) : BlockState(BlockType.WHITE_WALL_BANNER)
