package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullShape

data class Rail(
	val shape: FullShape,
	val waterlogged: Boolean
) : BlockState(BlockType.RAIL)
