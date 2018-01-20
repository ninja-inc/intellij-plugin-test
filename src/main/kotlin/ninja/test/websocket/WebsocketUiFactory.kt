package ninja.test.websocket

import com.intellij.openapi.diagnostic.Logger
import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.ToolWindow
import com.intellij.openapi.wm.ToolWindowFactory

class WebsocketUiFactory : ToolWindowFactory {
    val log = Logger.getInstance(this::class.java)

    override fun createToolWindowContent(project: Project, toolWindow: ToolWindow) {
        log.info("factory starts")

        val clientToolWindow = WebSocketUi()

        toolWindow.component.parent.add(clientToolWindow)
    }
}