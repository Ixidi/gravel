package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class Kelp(
	val age: Int
) : BlockState(BlockType.KELP)
