package ninja.test.websocket

import javax.websocket.*

@ClientEndpoint
class WebsocketClient {
    var session: Session? = null
    var messageHandler: MessageHandler? = null

    @OnOpen
    fun onOpen(session: Session) {
        this.session = session
    }

    @OnClose
    fun onClose(session: Session, reason: CloseReason) {
        this.session = null
    }

    @OnMessage
    fun onMessage(message: String) {
        messageHandler?.handleMessage(message)
    }

    fun addMessageHandler(messageHandler: MessageHandler) {
        this.messageHandler = messageHandler
    }

    fun sendMessage(message: String) {
        session?.getAsyncRemote()?.sendText(message)
    }

    interface MessageHandler {
        fun handleMessage(message: String)
    }
}
