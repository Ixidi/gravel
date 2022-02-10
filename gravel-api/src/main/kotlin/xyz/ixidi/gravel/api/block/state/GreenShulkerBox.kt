package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class GreenShulkerBox(
	val facing: FullFacing
) : BlockState(BlockType.GREEN_SHULKER_BOX)
