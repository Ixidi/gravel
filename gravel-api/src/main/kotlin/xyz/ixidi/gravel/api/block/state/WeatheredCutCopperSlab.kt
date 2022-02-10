package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.SlabType

data class WeatheredCutCopperSlab(
	val type: SlabType,
	val waterlogged: Boolean
) : BlockState(BlockType.WEATHERED_CUT_COPPER_SLAB)
