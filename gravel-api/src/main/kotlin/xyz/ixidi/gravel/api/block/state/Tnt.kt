package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class Tnt(
	val unstable: Boolean
) : BlockState(BlockType.TNT)
