package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class AcaciaSign(
	val rotation: Int,
	val waterlogged: Boolean
) : BlockState(BlockType.ACACIA_SIGN)
