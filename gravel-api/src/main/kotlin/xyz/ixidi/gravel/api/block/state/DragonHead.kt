package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class DragonHead(
	val rotation: Int
) : BlockState(BlockType.DRAGON_HEAD)
