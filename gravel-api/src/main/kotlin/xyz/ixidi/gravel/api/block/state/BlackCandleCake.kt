package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class BlackCandleCake(
	val lit: Boolean
) : BlockState(BlockType.BLACK_CANDLE_CAKE)
