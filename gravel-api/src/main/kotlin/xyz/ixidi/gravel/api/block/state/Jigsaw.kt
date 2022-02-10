package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.Orientation

data class Jigsaw(
	val orientation: Orientation
) : BlockState(BlockType.JIGSAW)
