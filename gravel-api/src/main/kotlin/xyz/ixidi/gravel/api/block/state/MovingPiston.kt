package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing
import xyz.ixidi.gravel.api.block.state.properties.PistonType

data class MovingPiston(
	val facing: FullFacing,
	val type: PistonType
) : BlockState(BlockType.MOVING_PISTON)
