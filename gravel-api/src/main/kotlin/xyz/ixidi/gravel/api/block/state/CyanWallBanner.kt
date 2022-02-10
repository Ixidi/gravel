package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class CyanWallBanner(
	val facing: FullFacing
) : BlockState(BlockType.CYAN_WALL_BANNER)
