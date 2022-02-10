package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class PinkBanner(
	val rotation: Int
) : BlockState(BlockType.PINK_BANNER)
