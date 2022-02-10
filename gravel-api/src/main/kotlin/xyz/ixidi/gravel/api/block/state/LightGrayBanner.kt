package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class LightGrayBanner(
	val rotation: Int
) : BlockState(BlockType.LIGHT_GRAY_BANNER)
