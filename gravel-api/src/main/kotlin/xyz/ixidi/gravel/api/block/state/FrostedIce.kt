package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class FrostedIce(
	val age: Int
) : BlockState(BlockType.FROSTED_ICE)
