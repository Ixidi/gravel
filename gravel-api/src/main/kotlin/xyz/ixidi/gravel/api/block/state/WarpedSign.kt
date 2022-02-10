package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class WarpedSign(
	val rotation: Int,
	val waterlogged: Boolean
) : BlockState(BlockType.WARPED_SIGN)
