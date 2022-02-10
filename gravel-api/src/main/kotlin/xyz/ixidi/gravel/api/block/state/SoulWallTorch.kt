package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class SoulWallTorch(
	val facing: FullFacing
) : BlockState(BlockType.SOUL_WALL_TORCH)
