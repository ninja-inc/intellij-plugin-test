package ninja.test.websocket.action

import com.intellij.openapi.application.ApplicationManager.getApplication

import com.intellij.notification.Notification
import com.intellij.notification.NotificationType
import com.intellij.notification.Notifications
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.diagnostic.Logger

class ConnectAction : AnAction() {
    val log = Logger.getInstance(this::class.java)

    override fun actionPerformed(e: AnActionEvent) {
        log.info("ConnectAction:actionPerformed")

        /*
        val serverAddress = WebSocketClientToolWindow.getAddressValue()
        getApplication().executeOnPooledThread {
            try {
                WebSocketClient.getInstance().connect(serverAddress)
            } catch (ex: Exception) {
                Notifications.Bus.notify(
                        Notification(
                                NOTIFICATION_ID,
                                "Unable to connect",
                                serverAddress,
                                NotificationType.ERROR)
                )
            }
        }
        */
    }

    override fun update(e: AnActionEvent?) {
        super.update(e)
        log.info("ConnectAction:actionPerformed")

        /*
        if (WebSocketClient.getInstance().isConnected()) {
            e!!.presentation.isEnabled = false
        } else {
            e!!.presentation.isEnabled = true
        }
        */
    }

    companion object {
        private val NOTIFICATION_ID = "Websocket Client"
    }
}
