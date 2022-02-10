package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.Axis3D

data class StrippedBirchLog(
	val axis: Axis3D
) : BlockState(BlockType.STRIPPED_BIRCH_LOG)
