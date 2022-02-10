package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class LimeBanner(
	val rotation: Int
) : BlockState(BlockType.LIME_BANNER)
