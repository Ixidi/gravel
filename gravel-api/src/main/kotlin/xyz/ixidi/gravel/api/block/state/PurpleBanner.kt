package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class PurpleBanner(
	val rotation: Int
) : BlockState(BlockType.PURPLE_BANNER)
