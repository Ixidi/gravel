package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class DarkOakLeaves(
	val distance: Int,
	val persistent: Boolean
) : BlockState(BlockType.DARK_OAK_LEAVES)
