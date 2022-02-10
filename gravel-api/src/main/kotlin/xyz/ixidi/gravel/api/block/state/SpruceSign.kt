package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class SpruceSign(
	val rotation: Int,
	val waterlogged: Boolean
) : BlockState(BlockType.SPRUCE_SIGN)
