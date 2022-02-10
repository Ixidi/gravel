package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.Face
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class BirchButton(
	val face: Face,
	val facing: FullFacing,
	val powered: Boolean
) : BlockState(BlockType.BIRCH_BUTTON)
