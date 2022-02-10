
package xyz.ixidi.gravel.v1_17_1.client
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.client.ClientSettingsPacket


class ClientSettingsPacketImpl : StandardPacket(), ClientSettingsPacket {
            
	override var locale: String by string()
	override var viewDistance: Byte by byte()
	// override var chatMode: ChatMode
	override var chatColors: Boolean by boolean()
	override var displayedSkinPart: UByte by uByte()
	// override var mainHand: MainHand
	override var disableTextFiltering: Boolean by boolean()
            
}
    