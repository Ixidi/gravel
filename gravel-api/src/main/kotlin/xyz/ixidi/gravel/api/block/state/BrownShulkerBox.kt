package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class BrownShulkerBox(
	val facing: FullFacing
) : BlockState(BlockType.BROWN_SHULKER_BOX)
