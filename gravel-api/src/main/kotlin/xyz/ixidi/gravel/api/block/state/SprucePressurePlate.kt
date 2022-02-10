package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class SprucePressurePlate(
	val powered: Boolean
) : BlockState(BlockType.SPRUCE_PRESSURE_PLATE)
