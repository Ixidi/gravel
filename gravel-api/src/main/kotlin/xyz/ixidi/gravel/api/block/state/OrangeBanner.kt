package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class OrangeBanner(
	val rotation: Int
) : BlockState(BlockType.ORANGE_BANNER)
