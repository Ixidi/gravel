package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class ChainCommandBlock(
	val conditional: Boolean,
	val facing: FullFacing
) : BlockState(BlockType.CHAIN_COMMAND_BLOCK)
