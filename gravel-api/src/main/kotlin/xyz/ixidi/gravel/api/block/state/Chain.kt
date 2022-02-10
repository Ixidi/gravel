package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.Axis3D

data class Chain(
	val axis: Axis3D,
	val waterlogged: Boolean
) : BlockState(BlockType.CHAIN)
