package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class AzaleaLeaves(
	val distance: Int,
	val persistent: Boolean
) : BlockState(BlockType.AZALEA_LEAVES)
