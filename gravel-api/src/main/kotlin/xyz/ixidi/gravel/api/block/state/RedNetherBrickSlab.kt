package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.SlabType

data class RedNetherBrickSlab(
	val type: SlabType,
	val waterlogged: Boolean
) : BlockState(BlockType.RED_NETHER_BRICK_SLAB)
