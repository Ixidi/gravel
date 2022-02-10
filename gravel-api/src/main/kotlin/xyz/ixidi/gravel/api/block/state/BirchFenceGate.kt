package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class BirchFenceGate(
	val facing: FullFacing,
	val in_wall: Boolean,
	val open: Boolean,
	val powered: Boolean
) : BlockState(BlockType.BIRCH_FENCE_GATE)
