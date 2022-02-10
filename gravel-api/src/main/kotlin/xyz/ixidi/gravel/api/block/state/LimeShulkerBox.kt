package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class LimeShulkerBox(
	val facing: FullFacing
) : BlockState(BlockType.LIME_SHULKER_BOX)
