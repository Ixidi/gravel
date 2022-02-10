package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class SkeletonWallSkull(
	val facing: FullFacing
) : BlockState(BlockType.SKELETON_WALL_SKULL)
