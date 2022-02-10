package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class Repeater(
	val delay: Int,
	val facing: FullFacing,
	val locked: Boolean,
	val powered: Boolean
) : BlockState(BlockType.REPEATER)
