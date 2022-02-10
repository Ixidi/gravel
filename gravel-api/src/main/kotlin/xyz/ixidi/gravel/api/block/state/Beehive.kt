package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class Beehive(
	val facing: FullFacing,
	val honey_level: Int
) : BlockState(BlockType.BEEHIVE)
