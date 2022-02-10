package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.Axis3D

data class QuartzPillar(
	val axis: Axis3D
) : BlockState(BlockType.QUARTZ_PILLAR)
