package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class Potatoes(
	val age: Int
) : BlockState(BlockType.POTATOES)
