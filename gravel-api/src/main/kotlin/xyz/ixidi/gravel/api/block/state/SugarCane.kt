package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class SugarCane(
	val age: Int
) : BlockState(BlockType.SUGAR_CANE)
