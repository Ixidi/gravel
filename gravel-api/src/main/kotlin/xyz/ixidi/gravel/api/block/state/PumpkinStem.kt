package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class PumpkinStem(
	val age: Int
) : BlockState(BlockType.PUMPKIN_STEM)
