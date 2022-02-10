package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class GrayGlazedTerracotta(
	val facing: FullFacing
) : BlockState(BlockType.GRAY_GLAZED_TERRACOTTA)
