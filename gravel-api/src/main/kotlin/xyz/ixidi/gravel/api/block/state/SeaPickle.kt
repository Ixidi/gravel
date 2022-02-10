package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class SeaPickle(
	val pickles: Int,
	val waterlogged: Boolean
) : BlockState(BlockType.SEA_PICKLE)
