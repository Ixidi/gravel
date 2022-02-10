package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class RepeatingCommandBlock(
	val conditional: Boolean,
	val facing: FullFacing
) : BlockState(BlockType.REPEATING_COMMAND_BLOCK)
