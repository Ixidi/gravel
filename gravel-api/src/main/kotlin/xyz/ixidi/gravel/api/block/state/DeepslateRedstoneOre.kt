package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class DeepslateRedstoneOre(
	val lit: Boolean
) : BlockState(BlockType.DEEPSLATE_REDSTONE_ORE)
