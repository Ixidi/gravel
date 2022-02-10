package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class LimeGlazedTerracotta(
	val facing: FullFacing
) : BlockState(BlockType.LIME_GLAZED_TERRACOTTA)
