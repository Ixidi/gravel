package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class BlastFurnace(
	val facing: FullFacing,
	val lit: Boolean
) : BlockState(BlockType.BLAST_FURNACE)
