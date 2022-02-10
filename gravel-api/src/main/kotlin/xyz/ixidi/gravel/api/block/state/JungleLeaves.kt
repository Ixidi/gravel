package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class JungleLeaves(
	val distance: Int,
	val persistent: Boolean
) : BlockState(BlockType.JUNGLE_LEAVES)
