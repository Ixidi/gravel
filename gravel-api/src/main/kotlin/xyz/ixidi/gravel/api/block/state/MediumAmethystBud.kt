package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class MediumAmethystBud(
	val facing: FullFacing,
	val waterlogged: Boolean
) : BlockState(BlockType.MEDIUM_AMETHYST_BUD)
