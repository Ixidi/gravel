package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.Instrument

data class NoteBlock(
	val instrument: Instrument,
	val note: Int,
	val powered: Boolean
) : BlockState(BlockType.NOTE_BLOCK)
