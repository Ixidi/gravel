package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class DeadTubeCoral(
	val waterlogged: Boolean
) : BlockState(BlockType.DEAD_TUBE_CORAL)
