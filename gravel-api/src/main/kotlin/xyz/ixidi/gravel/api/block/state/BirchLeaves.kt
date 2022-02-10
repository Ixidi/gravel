package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class BirchLeaves(
	val distance: Int,
	val persistent: Boolean
) : BlockState(BlockType.BIRCH_LEAVES)
