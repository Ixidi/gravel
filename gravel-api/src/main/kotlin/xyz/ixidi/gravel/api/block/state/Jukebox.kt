package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class Jukebox(
	val has_record: Boolean
) : BlockState(BlockType.JUKEBOX)
