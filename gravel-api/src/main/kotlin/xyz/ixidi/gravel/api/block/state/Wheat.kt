package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class Wheat(
	val age: Int
) : BlockState(BlockType.WHEAT)
