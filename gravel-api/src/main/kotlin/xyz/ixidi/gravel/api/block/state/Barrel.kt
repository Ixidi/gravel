package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class Barrel(
	val facing: FullFacing,
	val open: Boolean
) : BlockState(BlockType.BARREL)
