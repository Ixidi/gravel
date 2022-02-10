
package xyz.ixidi.gravel.v1_17_1.server
        
import xyz.ixidi.gravel.protocol.packet.StandardPacket
import xyz.ixidi.gravel.protocol.packet.play.server.ServerOpenWindowsPacket
import xyz.ixidi.gravel.api.component.TextComponent

class ServerOpenWindowsPacketImpl : StandardPacket(), ServerOpenWindowsPacket {
            
	override var windowsId: Int by varInt()
	// override var windowType: WindowType
	override var windowTitle: TextComponent by textComponent()
            
}
    