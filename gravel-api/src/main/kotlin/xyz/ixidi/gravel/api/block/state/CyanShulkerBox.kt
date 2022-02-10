package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class CyanShulkerBox(
	val facing: FullFacing
) : BlockState(BlockType.CYAN_SHULKER_BOX)
