package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class ChorusFlower(
	val age: Int
) : BlockState(BlockType.CHORUS_FLOWER)
