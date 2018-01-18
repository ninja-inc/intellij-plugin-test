package ninja.test

import com.android.tools.profiler.proto.Common
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.CommonDataKeys
import com.intellij.openapi.command.WriteCommandAction

class ReplaceText : AnAction() {

    override fun actionPerformed(e: AnActionEvent) {
        val editor = e.getRequiredData(CommonDataKeys.EDITOR)
        val project = e.getRequiredData(CommonDataKeys.PROJECT)
        val document = editor.document
        val selectionModel = editor.selectionModel

        val start = selectionModel.selectionStart
        val end = selectionModel.selectionEnd

        val runnable = Runnable {
            document.replaceString(start, end, "replacedByKotlin")
        }

        WriteCommandAction.runWriteCommandAction(project, runnable)
        selectionModel.removeSelection()
    }
}
