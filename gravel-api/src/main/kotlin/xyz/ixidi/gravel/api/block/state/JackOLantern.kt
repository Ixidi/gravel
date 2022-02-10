package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class JackOLantern(
	val facing: FullFacing
) : BlockState(BlockType.JACK_O_LANTERN)
