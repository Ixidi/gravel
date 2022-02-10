package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.property.Face
import xyz.ixidi.gravel.api.block.state.property.FullFacing

data class AcaciaButtonBlockState(
	val face: Face,
	val facing: FullFacing,
	val powered: Boolean
) : BlockState(BlockType.ACACIA_BUTTON)
