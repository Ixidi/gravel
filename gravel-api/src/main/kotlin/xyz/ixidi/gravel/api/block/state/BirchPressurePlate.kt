package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class BirchPressurePlate(
	val powered: Boolean
) : BlockState(BlockType.BIRCH_PRESSURE_PLATE)
