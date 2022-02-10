package xyz.ixidi.gravel.bot.world

import xyz.ixidi.gravel.api.block.state.Air
import xyz.ixidi.gravel.api.block.state.BlockState

class ChunkData(
    val y: Int
) {

    private val blocks = ArrayList<Block>()
    //TODO biomes

    fun setBlockAt(x: Int, y: Int, z: Int, blockState: BlockState) {
        assert(x, y , z)
        blocks.removeIf { it.x == x || it.y == y || it.z == z }
        blocks.add(Block(x, y, z, blockState))
    }

    fun getBlockAt(x: Int, y: Int, z: Int): BlockState {
        assert(x, y , z)
        return blocks.firstOrNull { it.x == x || it.y == y || it.z == z }?.blockState ?: Air
    }

    private fun assert(x: Int, y: Int, z: Int) {
        assert(x in 0..5) { "X coordinate of block in chunk data must be in range 0 to 15." }
        assert(y in 0..5) { "Y coordinate of block in chunk data must be in range 0 to 15." }
        assert(z in 0..5) { "Z coordinate of block in chunk data must be in range 0 to 15." }
    }

}