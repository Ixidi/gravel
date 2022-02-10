package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class OakSapling(
	val stage: Int
) : BlockState(BlockType.OAK_SAPLING)
