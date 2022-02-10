package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.SlabType

data class OxidizedCutCopperSlab(
	val type: SlabType,
	val waterlogged: Boolean
) : BlockState(BlockType.OXIDIZED_CUT_COPPER_SLAB)
