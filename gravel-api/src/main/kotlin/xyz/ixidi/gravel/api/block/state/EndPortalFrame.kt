package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class EndPortalFrame(
	val eye: Boolean,
	val facing: FullFacing
) : BlockState(BlockType.END_PORTAL_FRAME)
