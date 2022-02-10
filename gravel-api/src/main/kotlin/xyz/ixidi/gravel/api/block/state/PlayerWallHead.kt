package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class PlayerWallHead(
	val facing: FullFacing
) : BlockState(BlockType.PLAYER_WALL_HEAD)
