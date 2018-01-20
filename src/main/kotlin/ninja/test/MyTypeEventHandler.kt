package ninja.test

import com.intellij.codeInsight.hint.HintManager
import com.intellij.openapi.actionSystem.DataContext
import com.intellij.openapi.command.WriteCommandAction
import com.intellij.openapi.diagnostic.Logger
import com.intellij.openapi.editor.Editor
import com.intellij.openapi.editor.actionSystem.TypedActionHandler

class MyTypeEventHandler : TypedActionHandler {
    val log = Logger.getInstance(this::class.java)

    override fun execute(editor: Editor, charTyped: Char, dataContext: DataContext) {
        val document = editor.document
        val project = editor.project
        val runnable = Runnable {
            //document.insertString(0, "Typed!")

            // shown in console of plugin project
            //System.out.println("You Typed Something!")

            // shown in ./build/idea-sandbox/system/log/idea.log
            log.info("typed: $charTyped")

            //HintManager.getInstance().showInformationHint(editor, "You Typed Something!, :" + charTyped)
        }
        WriteCommandAction.runWriteCommandAction(project, runnable)
    }
}