package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.FullFacing

data class DamagedAnvil(
	val facing: FullFacing
) : BlockState(BlockType.DAMAGED_ANVIL)
