package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class CreeperWallHead(
	val facing: FullFacing
) : BlockState(BlockType.CREEPER_WALL_HEAD)
