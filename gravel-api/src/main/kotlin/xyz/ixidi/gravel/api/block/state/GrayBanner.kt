package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class GrayBanner(
	val rotation: Int
) : BlockState(BlockType.GRAY_BANNER)
