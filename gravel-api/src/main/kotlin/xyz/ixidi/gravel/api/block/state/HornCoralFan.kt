package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class HornCoralFan(
	val waterlogged: Boolean
) : BlockState(BlockType.HORN_CORAL_FAN)
