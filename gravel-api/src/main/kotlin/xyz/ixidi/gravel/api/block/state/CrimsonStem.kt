package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.Axis3D

data class CrimsonStem(
	val axis: Axis3D
) : BlockState(BlockType.CRIMSON_STEM)
