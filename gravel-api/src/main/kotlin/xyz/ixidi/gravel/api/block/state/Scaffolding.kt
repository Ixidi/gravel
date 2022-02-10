package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class Scaffolding(
	val bottom: Boolean,
	val distance: Int,
	val waterlogged: Boolean
) : BlockState(BlockType.SCAFFOLDING)
