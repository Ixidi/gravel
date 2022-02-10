package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class DeadBrainCoralFan(
	val waterlogged: Boolean
) : BlockState(BlockType.DEAD_BRAIN_CORAL_FAN)
