package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class BlueShulkerBox(
	val facing: FullFacing
) : BlockState(BlockType.BLUE_SHULKER_BOX)
