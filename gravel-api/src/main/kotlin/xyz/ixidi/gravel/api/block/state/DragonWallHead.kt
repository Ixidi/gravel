package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class DragonWallHead(
	val facing: FullFacing
) : BlockState(BlockType.DRAGON_WALL_HEAD)
