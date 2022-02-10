package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class LightWeightedPressurePlate(
	val power: Int
) : BlockState(BlockType.LIGHT_WEIGHTED_PRESSURE_PLATE)
