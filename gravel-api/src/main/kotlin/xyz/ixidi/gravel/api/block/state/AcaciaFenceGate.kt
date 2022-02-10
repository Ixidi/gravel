package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class AcaciaFenceGate(
	val facing: FullFacing,
	val in_wall: Boolean,
	val open: Boolean,
	val powered: Boolean
) : BlockState(BlockType.ACACIA_FENCE_GATE)
