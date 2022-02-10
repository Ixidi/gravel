package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class YellowBanner(
	val rotation: Int
) : BlockState(BlockType.YELLOW_BANNER)
