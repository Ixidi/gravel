package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class BubbleCoralFan(
	val waterlogged: Boolean
) : BlockState(BlockType.BUBBLE_CORAL_FAN)