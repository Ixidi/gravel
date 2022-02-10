package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class SoulLantern(
	val hanging: Boolean,
	val waterlogged: Boolean
) : BlockState(BlockType.SOUL_LANTERN)
