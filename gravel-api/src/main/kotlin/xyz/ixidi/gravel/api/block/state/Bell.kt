package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing
import xyz.ixidi.gravel.api.block.state.properties.Attachment

data class Bell(
	val attachment: Attachment,
	val facing: FullFacing,
	val powered: Boolean
) : BlockState(BlockType.BELL)
