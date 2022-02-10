package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class Fire(
	val age: Int,
	val east: Boolean,
	val north: Boolean,
	val south: Boolean,
	val up: Boolean,
	val west: Boolean
) : BlockState(BlockType.FIRE)
