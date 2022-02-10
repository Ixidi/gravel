package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class Composter(
	val level: Int
) : BlockState(BlockType.COMPOSTER)
