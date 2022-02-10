package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class HangingRoots(
	val waterlogged: Boolean
) : BlockState(BlockType.HANGING_ROOTS)
