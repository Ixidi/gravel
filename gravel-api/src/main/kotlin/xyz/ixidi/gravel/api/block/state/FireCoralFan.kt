package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class FireCoralFan(
	val waterlogged: Boolean
) : BlockState(BlockType.FIRE_CORAL_FAN)
