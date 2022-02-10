package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.SlabType

data class SmoothRedSandstoneSlab(
	val type: SlabType,
	val waterlogged: Boolean
) : BlockState(BlockType.SMOOTH_RED_SANDSTONE_SLAB)
