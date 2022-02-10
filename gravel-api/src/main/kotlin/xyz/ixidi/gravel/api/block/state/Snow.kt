package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class Snow(
	val layers: Int
) : BlockState(BlockType.SNOW)
