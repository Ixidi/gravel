package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class CyanGlazedTerracotta(
	val facing: FullFacing
) : BlockState(BlockType.CYAN_GLAZED_TERRACOTTA)
