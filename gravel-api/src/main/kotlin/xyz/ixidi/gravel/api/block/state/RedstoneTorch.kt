package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class RedstoneTorch(
	val lit: Boolean
) : BlockState(BlockType.REDSTONE_TORCH)
