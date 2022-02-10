package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class MagentaGlazedTerracotta(
	val facing: FullFacing
) : BlockState(BlockType.MAGENTA_GLAZED_TERRACOTTA)
