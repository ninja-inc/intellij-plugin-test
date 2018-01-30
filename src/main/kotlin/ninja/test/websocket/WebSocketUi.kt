package ninja.test.websocket

import com.intellij.openapi.actionSystem.ActionManager
import com.intellij.openapi.actionSystem.ActionToolbar
import com.intellij.openapi.actionSystem.DefaultActionGroup
import com.intellij.openapi.diagnostic.Logger
import com.intellij.openapi.ui.SimpleToolWindowPanel
import com.intellij.ui.EditorTextField
import com.intellij.ui.JBSplitter
import com.intellij.ui.components.JBLabel
import com.intellij.ui.components.JBPanel
import com.intellij.ui.components.JBTextField
import java.awt.BorderLayout
import java.awt.FlowLayout
import javax.swing.JTextField
import javax.swing.SwingConstants

class WebSocketUi: SimpleToolWindowPanel {
    val log = Logger.getInstance(this::class.java)

    constructor() : super(true, false) {
        log.info("WebSocketUi constructor, test")

        val textField = JTextField(8)
        this.add(textField)
    }

/*
    constructor(): super(true, false) {
        log.info("WebSocketUi constructor")

        val mainPanel = JBPanel<JBPanel<*>>(BorderLayout())
        val addressPanel = JBPanel<JBPanel<*>>(FlowLayout(FlowLayout.LEFT))

        val rightToolbar = createToolbar()

        val addressLabel = JBLabel("Location: ")

        val addressTextField = JBTextField(25)
        addressPanel.add(addressLabel)
        addressPanel.add(addressTextField)

        mainPanel.add(addressPanel, BorderLayout.NORTH)

        val requestTextField = EditorTextField()
        val responseTextField = EditorTextField()
        requestTextField.setPlaceholder("Request")
        responseTextField.setPlaceholder("Response")

        val splitter = JBSplitter(false, 0.5f)
        splitter.setShowDividerControls(true)
        splitter.setFirstComponent(requestTextField)
        splitter.setSecondComponent(responseTextField)

        mainPanel.add(splitter, BorderLayout.CENTER)

        setContent(mainPanel)
        setToolbar(rightToolbar.getComponent())
    }

    private fun createToolbar(): ActionToolbar {
        val toolbarId = "WebsocketClient.Toolbar"
        val groupFromConfig = ActionManager.getInstance().getAction(toolbarId) as DefaultActionGroup
        val group = DefaultActionGroup(groupFromConfig)
        val am = ActionManager.getInstance()

        val toolbar = am.createActionToolbar(toolbarId, group, true)
        toolbar.setOrientation(SwingConstants.VERTICAL)

        return toolbar
    }
        */
}