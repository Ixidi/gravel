package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class CreeperHead(
	val rotation: Int
) : BlockState(BlockType.CREEPER_HEAD)
