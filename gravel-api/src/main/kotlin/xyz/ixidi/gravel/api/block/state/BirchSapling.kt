package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class BirchSapling(
	val stage: Int
) : BlockState(BlockType.BIRCH_SAPLING)
