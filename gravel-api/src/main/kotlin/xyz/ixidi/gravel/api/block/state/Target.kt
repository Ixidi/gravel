package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class Target(
	val power: Int
) : BlockState(BlockType.TARGET)
