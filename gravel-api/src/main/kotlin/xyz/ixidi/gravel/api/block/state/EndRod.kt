package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class EndRod(
	val facing: FullFacing
) : BlockState(BlockType.END_ROD)
