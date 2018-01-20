package ninja.test.websocket.action

import com.intellij.openapi.application.ApplicationManager.getApplication

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.diagnostic.Logger

class SendAction : AnAction() {
    val log = Logger.getInstance(this::class.java)

    override fun actionPerformed(e: AnActionEvent) {
        log.info("SendAction:actionPerformed")
        /*
        run {
            getApplication().executeOnPooledThread {
                WebSocketClient.getInstance()
                        .send(WebSocketClientToolWindow.getRequestValue())
            }
        }
        */
    }

    override fun update(e: AnActionEvent?) {
        log.info("SendAction:update")
        /*
        super.update(e)
        if (WebSocketClient.getInstance().isConnected()) {
            e!!.presentation.isEnabled = true
        } else {
            e!!.presentation.isEnabled = false
        }
        */
    }
}
