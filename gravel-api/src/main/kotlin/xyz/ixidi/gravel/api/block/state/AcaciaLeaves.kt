package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class AcaciaLeaves(
	val distance: Int,
	val persistent: Boolean
) : BlockState(BlockType.ACACIA_LEAVES)
