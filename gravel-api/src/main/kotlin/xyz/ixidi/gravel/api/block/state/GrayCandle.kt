package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType

data class GrayCandle(
	val candles: Int,
	val lit: Boolean,
	val waterlogged: Boolean
) : BlockState(BlockType.GRAY_CANDLE)
