package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class LightBlueGlazedTerracotta(
	val facing: FullFacing
) : BlockState(BlockType.LIGHT_BLUE_GLAZED_TERRACOTTA)
