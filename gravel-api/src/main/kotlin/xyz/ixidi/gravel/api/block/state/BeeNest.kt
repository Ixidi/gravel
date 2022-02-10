package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class BeeNest(
	val facing: FullFacing,
	val honey_level: Int
) : BlockState(BlockType.BEE_NEST)
