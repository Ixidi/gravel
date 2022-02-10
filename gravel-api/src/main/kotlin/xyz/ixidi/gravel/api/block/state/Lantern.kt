package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class Lantern(
	val hanging: Boolean,
	val waterlogged: Boolean
) : BlockState(BlockType.LANTERN)
