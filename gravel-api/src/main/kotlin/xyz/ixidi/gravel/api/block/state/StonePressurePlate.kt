package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class StonePressurePlate(
	val powered: Boolean
) : BlockState(BlockType.STONE_PRESSURE_PLATE)
