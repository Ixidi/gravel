package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.DoorHalf

data class Lilac(
	val half: DoorHalf
) : BlockState(BlockType.LILAC)
