package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing
import xyz.ixidi.gravel.api.block.state.properties.PistonType

data class PistonHead(
	val facing: FullFacing,
	val short: Boolean,
	val type: PistonType
) : BlockState(BlockType.PISTON_HEAD)
