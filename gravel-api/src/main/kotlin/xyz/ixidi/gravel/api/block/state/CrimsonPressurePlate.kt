package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class CrimsonPressurePlate(
	val powered: Boolean
) : BlockState(BlockType.CRIMSON_PRESSURE_PLATE)
