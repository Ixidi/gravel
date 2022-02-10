package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class Mycelium(
	val snowy: Boolean
) : BlockState(BlockType.MYCELIUM)
