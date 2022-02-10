package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.WallDirection

data class GraniteWall(
	val east: WallDirection,
	val north: WallDirection,
	val south: WallDirection,
	val up: Boolean,
	val waterlogged: Boolean,
	val west: WallDirection
) : BlockState(BlockType.GRANITE_WALL)
