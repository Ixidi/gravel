package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class DeadHornCoral(
	val waterlogged: Boolean
) : BlockState(BlockType.DEAD_HORN_CORAL)
