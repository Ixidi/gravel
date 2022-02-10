package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class BrainCoralFan(
	val waterlogged: Boolean
) : BlockState(BlockType.BRAIN_CORAL_FAN)
