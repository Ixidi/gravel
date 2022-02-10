package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class BlueGlazedTerracotta(
	val facing: FullFacing
) : BlockState(BlockType.BLUE_GLAZED_TERRACOTTA)
