package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class PlayerHead(
	val rotation: Int
) : BlockState(BlockType.PLAYER_HEAD)
