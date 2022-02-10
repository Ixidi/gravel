package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class MagentaBanner(
	val rotation: Int
) : BlockState(BlockType.MAGENTA_BANNER)
