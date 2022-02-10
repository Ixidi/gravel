package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class Furnace(
	val facing: FullFacing,
	val lit: Boolean
) : BlockState(BlockType.FURNACE)
