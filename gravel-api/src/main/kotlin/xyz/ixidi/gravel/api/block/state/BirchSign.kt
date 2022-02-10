package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class BirchSign(
	val rotation: Int,
	val waterlogged: Boolean
) : BlockState(BlockType.BIRCH_SIGN)
