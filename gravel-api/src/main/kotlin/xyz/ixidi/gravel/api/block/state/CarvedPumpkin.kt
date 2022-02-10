package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class CarvedPumpkin(
	val facing: FullFacing
) : BlockState(BlockType.CARVED_PUMPKIN)
