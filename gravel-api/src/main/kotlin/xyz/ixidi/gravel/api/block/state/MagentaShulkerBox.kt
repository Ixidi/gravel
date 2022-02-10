package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class MagentaShulkerBox(
	val facing: FullFacing
) : BlockState(BlockType.MAGENTA_SHULKER_BOX)
