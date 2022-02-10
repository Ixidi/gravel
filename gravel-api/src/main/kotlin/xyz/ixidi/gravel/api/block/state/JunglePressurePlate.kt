package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class JunglePressurePlate(
	val powered: Boolean
) : BlockState(BlockType.JUNGLE_PRESSURE_PLATE)
