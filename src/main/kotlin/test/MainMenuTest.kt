package test

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.PlatformDataKeys
import com.intellij.openapi.ui.Messages

class MainMenuTest : AnAction() {

    override fun actionPerformed(e: AnActionEvent) {
        val project = e.getData(PlatformDataKeys.PROJECT)
        val txt = Messages.showInputDialog(project,
                "What is your name?", "Input your name", Messages.getQuestionIcon())
        Messages.showMessageDialog(project,
                "Hello, $txt!\n I am glad to see you.", "Information", Messages.getInformationIcon())
    }
}
