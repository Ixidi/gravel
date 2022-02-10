package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class RedGlazedTerracotta(
	val facing: FullFacing
) : BlockState(BlockType.RED_GLAZED_TERRACOTTA)
