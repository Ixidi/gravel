package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class YellowShulkerBox(
	val facing: FullFacing
) : BlockState(BlockType.YELLOW_SHULKER_BOX)
