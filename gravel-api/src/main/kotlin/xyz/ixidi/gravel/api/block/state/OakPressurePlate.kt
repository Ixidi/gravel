package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class OakPressurePlate(
	val powered: Boolean
) : BlockState(BlockType.OAK_PRESSURE_PLATE)
