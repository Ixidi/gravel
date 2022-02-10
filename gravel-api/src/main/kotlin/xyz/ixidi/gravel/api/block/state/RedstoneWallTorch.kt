package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class RedstoneWallTorch(
	val facing: FullFacing,
	val lit: Boolean
) : BlockState(BlockType.REDSTONE_WALL_TORCH)
