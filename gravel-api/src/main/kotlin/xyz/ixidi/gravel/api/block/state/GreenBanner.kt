package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class GreenBanner(
	val rotation: Int
) : BlockState(BlockType.GREEN_BANNER)
