package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class WitherSkeletonWallSkull(
	val facing: FullFacing
) : BlockState(BlockType.WITHER_SKELETON_WALL_SKULL)
