package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class MelonStem(
	val age: Int
) : BlockState(BlockType.MELON_STEM)
