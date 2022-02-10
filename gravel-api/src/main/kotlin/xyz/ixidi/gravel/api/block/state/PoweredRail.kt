package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.Shape

data class PoweredRail(
	val powered: Boolean,
	val shape: Shape,
	val waterlogged: Boolean
) : BlockState(BlockType.POWERED_RAIL)
