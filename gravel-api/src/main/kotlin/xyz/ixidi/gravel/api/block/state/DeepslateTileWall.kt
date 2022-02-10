package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.WallDirection

data class DeepslateTileWall(
	val east: WallDirection,
	val north: WallDirection,
	val south: WallDirection,
	val up: Boolean,
	val waterlogged: Boolean,
	val west: WallDirection
) : BlockState(BlockType.DEEPSLATE_TILE_WALL)
