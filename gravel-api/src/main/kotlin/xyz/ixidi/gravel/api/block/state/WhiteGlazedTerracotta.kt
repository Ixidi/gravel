package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class WhiteGlazedTerracotta(
	val facing: FullFacing
) : BlockState(BlockType.WHITE_GLAZED_TERRACOTTA)
