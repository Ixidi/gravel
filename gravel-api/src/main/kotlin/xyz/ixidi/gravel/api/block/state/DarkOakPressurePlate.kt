package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class DarkOakPressurePlate(
	val powered: Boolean
) : BlockState(BlockType.DARK_OAK_PRESSURE_PLATE)
