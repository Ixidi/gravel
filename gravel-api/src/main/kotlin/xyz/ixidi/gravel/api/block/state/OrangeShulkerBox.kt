package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class OrangeShulkerBox(
	val facing: FullFacing
) : BlockState(BlockType.ORANGE_SHULKER_BOX)
