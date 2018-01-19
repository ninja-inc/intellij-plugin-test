package ninja.test

import com.intellij.openapi.actionSystem.DataContext
import com.intellij.openapi.command.WriteCommandAction
import com.intellij.openapi.editor.Editor
import com.intellij.openapi.editor.actionSystem.TypedActionHandler

class MyTypeEventHandler : TypedActionHandler {
    override fun execute(editor: Editor, charTyped: Char, dataContext: DataContext) {
        val document = editor.document
        val project = editor.project
        val runnable = Runnable {
            document.insertString(0, "Typed!")
        }
        WriteCommandAction.runWriteCommandAction(project, runnable)
    }
}