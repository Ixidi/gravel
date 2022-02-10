package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.Leaves

data class Bamboo(
	val age: Int,
	val leaves: Leaves,
	val stage: Int
) : BlockState(BlockType.BAMBOO)
