package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class FloweringAzaleaLeaves(
	val distance: Int,
	val persistent: Boolean
) : BlockState(BlockType.FLOWERING_AZALEA_LEAVES)
