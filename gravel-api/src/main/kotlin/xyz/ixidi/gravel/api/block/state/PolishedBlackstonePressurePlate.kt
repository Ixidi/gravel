package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class PolishedBlackstonePressurePlate(
	val powered: Boolean
) : BlockState(BlockType.POLISHED_BLACKSTONE_PRESSURE_PLATE)
