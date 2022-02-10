package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.StructureMode

data class StructureBlock(
	val mode: StructureMode
) : BlockState(BlockType.STRUCTURE_BLOCK)
