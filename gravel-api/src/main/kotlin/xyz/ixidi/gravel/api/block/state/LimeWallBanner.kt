package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class LimeWallBanner(
	val facing: FullFacing
) : BlockState(BlockType.LIME_WALL_BANNER)
