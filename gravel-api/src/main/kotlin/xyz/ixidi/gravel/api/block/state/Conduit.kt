package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class Conduit(
	val waterlogged: Boolean
) : BlockState(BlockType.CONDUIT)
