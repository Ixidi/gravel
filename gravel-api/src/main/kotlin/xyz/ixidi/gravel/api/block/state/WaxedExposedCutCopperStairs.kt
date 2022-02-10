package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing
import xyz.ixidi.gravel.api.block.state.properties.HalfPosition
import xyz.ixidi.gravel.api.block.state.properties.StairsShape

data class WaxedExposedCutCopperStairs(
	val facing: FullFacing,
	val half: HalfPosition,
	val shape: StairsShape,
	val waterlogged: Boolean
) : BlockState(BlockType.WAXED_EXPOSED_CUT_COPPER_STAIRS)
