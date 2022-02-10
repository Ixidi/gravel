package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class WhiteBanner(
	val rotation: Int
) : BlockState(BlockType.WHITE_BANNER)
