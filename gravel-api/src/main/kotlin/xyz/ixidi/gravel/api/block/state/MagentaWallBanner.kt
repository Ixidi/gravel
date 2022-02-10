package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class MagentaWallBanner(
	val facing: FullFacing
) : BlockState(BlockType.MAGENTA_WALL_BANNER)
