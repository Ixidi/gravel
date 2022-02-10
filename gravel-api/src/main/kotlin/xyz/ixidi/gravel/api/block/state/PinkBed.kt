package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing
import xyz.ixidi.gravel.api.block.state.properties.BedPart

data class PinkBed(
	val facing: FullFacing,
	val occupied: Boolean,
	val part: BedPart
) : BlockState(BlockType.PINK_BED)
