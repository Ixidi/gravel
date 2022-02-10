package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class BlackStainedGlassPane(
	val east: Boolean,
	val north: Boolean,
	val south: Boolean,
	val waterlogged: Boolean,
	val west: Boolean
) : BlockState(BlockType.BLACK_STAINED_GLASS_PANE)
