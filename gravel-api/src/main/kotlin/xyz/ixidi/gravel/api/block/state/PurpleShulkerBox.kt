package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class PurpleShulkerBox(
	val facing: FullFacing
) : BlockState(BlockType.PURPLE_SHULKER_BOX)
