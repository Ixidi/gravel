package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class CaveVines(
	val age: Int,
	val berries: Boolean
) : BlockState(BlockType.CAVE_VINES)
