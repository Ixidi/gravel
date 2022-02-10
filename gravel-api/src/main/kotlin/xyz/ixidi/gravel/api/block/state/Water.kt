package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class Water(
	val level: Int
) : BlockState(BlockType.WATER)
