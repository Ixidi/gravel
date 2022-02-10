package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class Tripwire(
	val attached: Boolean,
	val disarmed: Boolean,
	val east: Boolean,
	val north: Boolean,
	val powered: Boolean,
	val south: Boolean,
	val west: Boolean
) : BlockState(BlockType.TRIPWIRE)
