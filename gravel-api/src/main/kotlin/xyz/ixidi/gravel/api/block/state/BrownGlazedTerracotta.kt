package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class BrownGlazedTerracotta(
	val facing: FullFacing
) : BlockState(BlockType.BROWN_GLAZED_TERRACOTTA)
