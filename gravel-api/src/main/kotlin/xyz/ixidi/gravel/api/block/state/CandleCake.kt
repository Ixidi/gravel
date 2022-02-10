package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class CandleCake(
	val lit: Boolean
) : BlockState(BlockType.CANDLE_CAKE)
