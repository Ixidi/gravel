package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class GrassBlock(
	val snowy: Boolean
) : BlockState(BlockType.GRASS_BLOCK)
