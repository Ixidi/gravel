package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.SlabType

data class DarkPrismarineSlab(
	val type: SlabType,
	val waterlogged: Boolean
) : BlockState(BlockType.DARK_PRISMARINE_SLAB)
