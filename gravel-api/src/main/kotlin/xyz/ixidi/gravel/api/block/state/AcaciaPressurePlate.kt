package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class AcaciaPressurePlate(
	val powered: Boolean
) : BlockState(BlockType.ACACIA_PRESSURE_PLATE)
