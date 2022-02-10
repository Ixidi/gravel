package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class HornCoral(
	val waterlogged: Boolean
) : BlockState(BlockType.HORN_CORAL)
