package ninja.test.websocket

import com.intellij.openapi.diagnostic.Logger
import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.SimpleToolWindowPanel
import com.intellij.openapi.wm.ToolWindow
import com.intellij.openapi.wm.ToolWindowFactory
import java.awt.Color
import java.awt.Font
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import javax.swing.*
import javax.swing.text.StyleConstants.getComponent





class WebsocketUiFactory : ToolWindowFactory {
    val log = Logger.getInstance(this::class.java)

    override fun createToolWindowContent(project: Project, toolWindow: ToolWindow) {
        log.info("factory starts")


        val label = JLabel("Hello World!")

        val textField = JTextField(8)
        textField.setFont(Font("ＭＳ ゴシック", Font.BOLD, 16))

        val button = JButton()
        button.addActionListener(object : ActionListener {
            val log = Logger.getInstance(this::class.java)
            override fun actionPerformed(e: ActionEvent?) {
                log.info("clicked!!")
            }
        })

        val jPanel = JPanel()
        jPanel.add(label)
        jPanel.setBackground(Color.RED)
        jPanel.add(textField)
        jPanel.add(button)

        val contentManager = toolWindow.contentManager
        val content = contentManager.factory.createContent(jPanel, null, false)

        contentManager.addContent(content)

        /*
        val contentManager = toolWindow.contentManager

        val clientToolWindow = SimpleToolWindowPanel(true)

        val textField = JTextField(8)
        textField.setFont(Font("ＭＳ ゴシック", Font.BOLD, 16))

        val jPanel = JPanel()
        jPanel.add(textField)

        clientToolWindow.setContent(jPanel)

        log.info("isVisible ${clientToolWindow.isVisible()}")
        toolWindow.component.parent.add(clientToolWindow)
        */

        /*
        val textField = JTextField(8)
        textField.setFont(Font("ＭＳ ゴシック", Font.BOLD, 16))

        val frame = JFrame("ObjectivesGUI")
        frame.add(textField)
        frame.pack()

        toolWindow.component.add(frame)
        */
    }
}