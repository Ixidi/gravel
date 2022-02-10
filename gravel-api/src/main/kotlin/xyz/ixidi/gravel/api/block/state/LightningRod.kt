package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class LightningRod(
	val facing: FullFacing,
	val powered: Boolean,
	val waterlogged: Boolean
) : BlockState(BlockType.LIGHTNING_ROD)
