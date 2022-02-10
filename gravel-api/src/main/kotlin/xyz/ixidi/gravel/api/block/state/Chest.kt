package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing
import xyz.ixidi.gravel.api.block.state.properties.ChestType

data class Chest(
	val facing: FullFacing,
	val type: ChestType,
	val waterlogged: Boolean
) : BlockState(BlockType.CHEST)
