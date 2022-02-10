package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class DaylightDetector(
	val inverted: Boolean,
	val power: Int
) : BlockState(BlockType.DAYLIGHT_DETECTOR)
