package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class CaveVinesPlant(
	val berries: Boolean
) : BlockState(BlockType.CAVE_VINES_PLANT)
