package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class RedBanner(
	val rotation: Int
) : BlockState(BlockType.RED_BANNER)
