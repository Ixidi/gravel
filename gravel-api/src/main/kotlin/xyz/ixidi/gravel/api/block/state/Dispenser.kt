package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class Dispenser(
	val facing: FullFacing,
	val triggered: Boolean
) : BlockState(BlockType.DISPENSER)
