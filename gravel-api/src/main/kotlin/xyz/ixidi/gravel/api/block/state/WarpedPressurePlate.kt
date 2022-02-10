package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class WarpedPressurePlate(
	val powered: Boolean
) : BlockState(BlockType.WARPED_PRESSURE_PLATE)
