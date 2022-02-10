package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class BrewingStand(
	val has_bottle_0: Boolean,
	val has_bottle_1: Boolean,
	val has_bottle_2: Boolean
) : BlockState(BlockType.BREWING_STAND)
