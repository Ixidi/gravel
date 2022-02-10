package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.SlabType

data class PurpurSlab(
	val type: SlabType,
	val waterlogged: Boolean
) : BlockState(BlockType.PURPUR_SLAB)
