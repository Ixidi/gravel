package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class CyanBanner(
	val rotation: Int
) : BlockState(BlockType.CYAN_BANNER)
