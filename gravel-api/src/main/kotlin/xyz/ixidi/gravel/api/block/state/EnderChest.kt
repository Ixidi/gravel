package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class EnderChest(
	val facing: FullFacing,
	val waterlogged: Boolean
) : BlockState(BlockType.ENDER_CHEST)
