package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class Piston(
	val extended: Boolean,
	val facing: FullFacing
) : BlockState(BlockType.PISTON)
