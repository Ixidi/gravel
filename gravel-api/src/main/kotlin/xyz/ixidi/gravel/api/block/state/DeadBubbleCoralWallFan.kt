package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class DeadBubbleCoralWallFan(
	val facing: FullFacing,
	val waterlogged: Boolean
) : BlockState(BlockType.DEAD_BUBBLE_CORAL_WALL_FAN)
