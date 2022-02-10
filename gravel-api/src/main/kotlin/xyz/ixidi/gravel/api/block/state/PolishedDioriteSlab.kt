package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.SlabType

data class PolishedDioriteSlab(
	val type: SlabType,
	val waterlogged: Boolean
) : BlockState(BlockType.POLISHED_DIORITE_SLAB)
