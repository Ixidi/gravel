package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class PinkGlazedTerracotta(
	val facing: FullFacing
) : BlockState(BlockType.PINK_GLAZED_TERRACOTTA)
