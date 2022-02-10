package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class DeadBubbleCoral(
	val waterlogged: Boolean
) : BlockState(BlockType.DEAD_BUBBLE_CORAL)
