package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class DeadFireCoralFan(
	val waterlogged: Boolean
) : BlockState(BlockType.DEAD_FIRE_CORAL_FAN)
