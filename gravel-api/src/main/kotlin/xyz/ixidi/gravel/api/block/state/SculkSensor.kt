package xyz.ixidi.gravel.api.block.state

import xyz.ixidi.gravel.api.block.BlockType
import xyz.ixidi.gravel.api.block.state.properties.SculkSensorPhase

data class SculkSensor(
	val power: Int,
	val sculk_sensor_phase: SculkSensorPhase,
	val waterlogged: Boolean
) : BlockState(BlockType.SCULK_SENSOR)
