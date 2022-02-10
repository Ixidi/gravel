package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class CrimsonFence(
	val east: Boolean,
	val north: Boolean,
	val south: Boolean,
	val waterlogged: Boolean,
	val west: Boolean
) : BlockState(BlockType.CRIMSON_FENCE)
