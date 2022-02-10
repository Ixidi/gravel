package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class BrownCandle(
	val candles: Int,
	val lit: Boolean,
	val waterlogged: Boolean
) : BlockState(BlockType.BROWN_CANDLE)
