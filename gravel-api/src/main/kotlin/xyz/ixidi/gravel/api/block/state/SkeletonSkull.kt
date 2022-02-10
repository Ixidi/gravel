package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class SkeletonSkull(
	val rotation: Int
) : BlockState(BlockType.SKELETON_SKULL)
