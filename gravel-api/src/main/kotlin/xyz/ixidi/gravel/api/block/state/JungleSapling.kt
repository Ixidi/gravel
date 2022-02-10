package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class JungleSapling(
	val stage: Int
) : BlockState(BlockType.JUNGLE_SAPLING)
