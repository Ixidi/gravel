package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class OakSign(
	val rotation: Int,
	val waterlogged: Boolean
) : BlockState(BlockType.OAK_SIGN)
