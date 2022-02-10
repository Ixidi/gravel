package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class WitherSkeletonSkull(
	val rotation: Int
) : BlockState(BlockType.WITHER_SKELETON_SKULL)
