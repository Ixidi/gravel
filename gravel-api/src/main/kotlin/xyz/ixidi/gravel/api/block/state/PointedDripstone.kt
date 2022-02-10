package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.VerticalDirection
import xyz.ixidi.gravel.api.block.state.properties.Thickness

data class PointedDripstone(
	val thickness: Thickness,
	val vertical_direction: VerticalDirection,
	val waterlogged: Boolean
) : BlockState(BlockType.POINTED_DRIPSTONE)
