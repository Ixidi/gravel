package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class OakLeaves(
	val distance: Int,
	val persistent: Boolean
) : BlockState(BlockType.OAK_LEAVES)
