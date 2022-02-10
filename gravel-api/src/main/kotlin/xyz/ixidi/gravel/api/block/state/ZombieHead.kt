package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class ZombieHead(
	val rotation: Int
) : BlockState(BlockType.ZOMBIE_HEAD)
