package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class DeadTubeCoralFan(
	val waterlogged: Boolean
) : BlockState(BlockType.DEAD_TUBE_CORAL_FAN)
