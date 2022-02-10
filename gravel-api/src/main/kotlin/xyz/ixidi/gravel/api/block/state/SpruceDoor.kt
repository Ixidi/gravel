package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing
import xyz.ixidi.gravel.api.block.state.properties.DoorHalf
import xyz.ixidi.gravel.api.block.state.properties.Hinge

data class SpruceDoor(
	val facing: FullFacing,
	val half: DoorHalf,
	val hinge: Hinge,
	val open: Boolean,
	val powered: Boolean
) : BlockState(BlockType.SPRUCE_DOOR)
