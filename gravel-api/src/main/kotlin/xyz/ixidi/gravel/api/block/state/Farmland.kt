package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class Farmland(
	val moisture: Int
) : BlockState(BlockType.FARMLAND)
