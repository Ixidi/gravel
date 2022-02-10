package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class SpruceLeaves(
	val distance: Int,
	val persistent: Boolean
) : BlockState(BlockType.SPRUCE_LEAVES)
