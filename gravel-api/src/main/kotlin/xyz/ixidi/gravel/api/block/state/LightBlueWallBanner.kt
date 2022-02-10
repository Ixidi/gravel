package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class LightBlueWallBanner(
	val facing: FullFacing
) : BlockState(BlockType.LIGHT_BLUE_WALL_BANNER)
