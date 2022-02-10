package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class Lectern(
	val facing: FullFacing,
	val has_book: Boolean,
	val powered: Boolean
) : BlockState(BlockType.LECTERN)
