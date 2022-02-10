package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class JungleSign(
	val rotation: Int,
	val waterlogged: Boolean
) : BlockState(BlockType.JUNGLE_SIGN)
