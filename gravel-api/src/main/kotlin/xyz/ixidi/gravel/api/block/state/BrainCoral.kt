package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class BrainCoral(
	val waterlogged: Boolean
) : BlockState(BlockType.BRAIN_CORAL)
