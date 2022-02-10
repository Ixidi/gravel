package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class PinkShulkerBox(
	val facing: FullFacing
) : BlockState(BlockType.PINK_SHULKER_BOX)
