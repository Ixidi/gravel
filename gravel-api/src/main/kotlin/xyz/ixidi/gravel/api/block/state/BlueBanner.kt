package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class BlueBanner(
	val rotation: Int
) : BlockState(BlockType.BLUE_BANNER)
