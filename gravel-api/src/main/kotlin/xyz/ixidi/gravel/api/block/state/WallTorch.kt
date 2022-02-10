package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class WallTorch(
	val facing: FullFacing
) : BlockState(BlockType.WALL_TORCH)
