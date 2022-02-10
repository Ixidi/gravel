package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class CrimsonSign(
	val rotation: Int,
	val waterlogged: Boolean
) : BlockState(BlockType.CRIMSON_SIGN)
