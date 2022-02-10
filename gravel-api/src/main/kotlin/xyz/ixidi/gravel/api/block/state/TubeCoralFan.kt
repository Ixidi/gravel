package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class TubeCoralFan(
	val waterlogged: Boolean
) : BlockState(BlockType.TUBE_CORAL_FAN)
