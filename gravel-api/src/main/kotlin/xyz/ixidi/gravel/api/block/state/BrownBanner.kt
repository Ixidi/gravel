package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class BrownBanner(
	val rotation: Int
) : BlockState(BlockType.BROWN_BANNER)
