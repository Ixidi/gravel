package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class Light(
	val level: Int,
	val waterlogged: Boolean
) : BlockState(BlockType.LIGHT)
