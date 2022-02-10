package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing
import xyz.ixidi.gravel.api.block.state.properties.Mode

data class Comparator(
	val facing: FullFacing,
	val mode: Mode,
	val powered: Boolean
) : BlockState(BlockType.COMPARATOR)
