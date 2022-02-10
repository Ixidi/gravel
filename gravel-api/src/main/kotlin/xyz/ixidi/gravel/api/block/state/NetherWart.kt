package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class NetherWart(
	val age: Int
) : BlockState(BlockType.NETHER_WART)
