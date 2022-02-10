package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class DeadHornCoralFan(
	val waterlogged: Boolean
) : BlockState(BlockType.DEAD_HORN_CORAL_FAN)
