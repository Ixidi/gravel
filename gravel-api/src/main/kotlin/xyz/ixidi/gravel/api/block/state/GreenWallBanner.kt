package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class GreenWallBanner(
	val facing: FullFacing
) : BlockState(BlockType.GREEN_WALL_BANNER)
