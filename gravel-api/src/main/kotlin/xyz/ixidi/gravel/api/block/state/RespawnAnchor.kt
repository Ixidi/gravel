package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class RespawnAnchor(
	val charges: Int
) : BlockState(BlockType.RESPAWN_ANCHOR)
