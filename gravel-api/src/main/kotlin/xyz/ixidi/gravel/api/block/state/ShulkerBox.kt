package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class ShulkerBox(
	val facing: FullFacing
) : BlockState(BlockType.SHULKER_BOX)
