package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.SlabType

data class AcaciaSlab(
	val type: SlabType,
	val waterlogged: Boolean
) : BlockState(BlockType.ACACIA_SLAB)
