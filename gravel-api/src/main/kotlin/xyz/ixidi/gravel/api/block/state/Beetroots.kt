package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class Beetroots(
	val age: Int
) : BlockState(BlockType.BEETROOTS)
