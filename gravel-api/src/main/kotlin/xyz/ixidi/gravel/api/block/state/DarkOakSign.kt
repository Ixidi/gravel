package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class DarkOakSign(
	val rotation: Int,
	val waterlogged: Boolean
) : BlockState(BlockType.DARK_OAK_SIGN)
