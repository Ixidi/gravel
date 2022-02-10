package xyz.ixidi.gravel.bot.service

import xyz.ixidi.gravel.api.block.BlockPalette
import xyz.ixidi.gravel.api.block.GlobalBlockPalette
import xyz.ixidi.gravel.api.block.IndirectBlockPalette
import xyz.ixidi.gravel.api.block.SingleValuedBlockPalette
import xyz.ixidi.gravel.bot.world.Chunk
import xyz.ixidi.gravel.bot.world.ChunkSection
import xyz.ixidi.gravel.protocol.packet.play.server.ServerBlockChangePacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerChunkDataPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerMultiBlockChangePacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerUnloadChunkPacket
import kotlin.system.measureTimeMillis

class ChunkService : Service() {

    override fun ServiceInitializer.init() {
        on<ServerChunkDataPacket> {
            val chunkSections = loadChunkSections(this@on)
            bot.world.addChunk(Chunk(chunkX, chunkZ, chunkSections))
        }
        on<ServerUnloadChunkPacket> {
            bot.world.removeChunk(chunkX, chunkZ)
        }
        on<ServerBlockChangePacket> {
            //x seems to always be 1 lower, dont know why
            bot.world.setBlockAt(
                location.x + 1,
                location.y,
                location.z,
                GlobalBlockPalette.getBlockStateById(blockId)!!
            )
        }
        on<ServerMultiBlockChangePacket> {
            val sectionX = chunkSection shr 42;
            val sectionY = chunkSection shl 44 shr 44;
            val sectionZ = chunkSection shl 22 shr 42;
            println("$sectionX $sectionY $sectionZ")
            val section =
                bot.world.getChunk(sectionX.toInt(), sectionZ.toInt())?.getChunkSection(sectionY.toInt()) ?: return@on
            blocks.forEach {
                val stateId = it ushr 12
                val blockX = it shl 52 ushr 60
                val blockY = it shl 60 ushr 60
                val blockZ = it shl 56 ushr 60

                section.setBlockAt(
                    blockX.toInt(),
                    blockY.toInt(),
                    blockZ.toInt(),
                    GlobalBlockPalette.getBlockStateById(stateId.toInt())!!
                )
            }
        }
    }

    private fun loadChunkSections(packet: ServerChunkDataPacket): List<ChunkSection> {
        val chunkSections = ArrayList<ChunkSection>()

        packet.chunkSections.forEachIndexed { index, chunkSection ->

            when (chunkSection) {
                ServerChunkDataPacket.ChunkSection.Empty -> chunkSections.add(ChunkSection(index))
                is ServerChunkDataPacket.ChunkSection.Normal -> {
                    val palette = when (val p = chunkSection.blocksStates.palette) {
                        is ServerChunkDataPacket.Palette.Direct -> GlobalBlockPalette
                        is ServerChunkDataPacket.Palette.Indirect -> {
                            val mapping = HashMap<Int, Int>()
                            p.palette.forEachIndexed { mappingIndex, i ->
                                mapping[mappingIndex] = i
                            }
                            IndirectBlockPalette(mapping)
                        }
                        is ServerChunkDataPacket.Palette.SingleValued -> SingleValuedBlockPalette(p.globalPaletteEntryId)
                        else -> throw Exception("Unknown palette.")
                    }


                    val actualSection = ChunkSection(index)

                    val data = chunkSection.blocksStates.data
                    val bitsPerEntry = chunkSection.bitsPerEntry.toInt()
                    val entriesPerLong = 64 / bitsPerEntry
                    val entryBitMask = ((1 shl bitsPerEntry) - 1).toLong()

                    for (x in 0..15) {
                        for (y in 0..15) {
                            for (z in 0..15) {
                                val blockNumber = (((y * 16) + z) * 16) + x
                                val longNumber = blockNumber / entriesPerLong
                                val longOffset = (blockNumber % entriesPerLong) * bitsPerEntry
                                val bitMask = entryBitMask shl longOffset

                                val blockId = (data[longNumber] and bitMask) ushr longOffset
                                actualSection.setBlockAt(x, y, z, palette.getBlockStateById(blockId.toInt())!!)
                            }

                        }

                    }
                    chunkSections.add(actualSection)
                }
            }
        }

        return chunkSections
    }

}