package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class SpruceSapling(
	val stage: Int
) : BlockState(BlockType.SPRUCE_SAPLING)
