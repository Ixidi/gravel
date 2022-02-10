package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class BlackBanner(
	val rotation: Int
) : BlockState(BlockType.BLACK_BANNER)
