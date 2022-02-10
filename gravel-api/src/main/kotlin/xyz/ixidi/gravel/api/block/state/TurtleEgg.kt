package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class TurtleEgg(
	val eggs: Int,
	val hatch: Int
) : BlockState(BlockType.TURTLE_EGG)
