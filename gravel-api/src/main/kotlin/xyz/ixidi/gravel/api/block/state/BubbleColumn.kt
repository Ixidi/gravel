package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class BubbleColumn(
	val drag: Boolean
) : BlockState(BlockType.BUBBLE_COLUMN)
