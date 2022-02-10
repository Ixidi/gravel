package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class BlackGlazedTerracotta(
	val facing: FullFacing
) : BlockState(BlockType.BLACK_GLAZED_TERRACOTTA)
