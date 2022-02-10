package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class DeadFireCoralWallFan(
	val facing: FullFacing,
	val waterlogged: Boolean
) : BlockState(BlockType.DEAD_FIRE_CORAL_WALL_FAN)
