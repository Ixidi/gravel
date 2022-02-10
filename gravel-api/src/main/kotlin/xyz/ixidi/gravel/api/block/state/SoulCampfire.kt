package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class SoulCampfire(
	val facing: FullFacing,
	val lit: Boolean,
	val signal_fire: Boolean,
	val waterlogged: Boolean
) : BlockState(BlockType.SOUL_CAMPFIRE)
