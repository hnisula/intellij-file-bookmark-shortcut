package com.hnisula.intellijfilebookmarkshortcut

import com.intellij.ide.bookmark.BookmarkType
import com.intellij.ide.bookmark.BookmarksManager
import com.intellij.ide.bookmark.providers.FileBookmarkImpl
import com.intellij.ide.bookmark.providers.LineBookmarkProvider
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.CommonDataKeys
import com.intellij.openapi.vfs.VirtualFile

class AddFileBookmarkUtil {
    fun addBookmark(e: AnActionEvent, bookmarkType: BookmarkType) {
        e.project?.let {
            var bookmarkProvider = LineBookmarkProvider.find(e.project!!)
            bookmarkProvider?.let {
                var manager = BookmarksManager.getInstance(e.project!!)

                var currentFile = e.getData<VirtualFile>(CommonDataKeys.VIRTUAL_FILE)
                currentFile?.let {
                    var bookmark = FileBookmarkImpl(bookmarkProvider, currentFile)
                    manager?.add(bookmark, bookmarkType)
                }
            }
        }
    }
}

class AddFileBookmarkAction1 : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        AddFileBookmarkUtil().addBookmark(e, BookmarkType.DIGIT_1)
    }
}

class AddFileBookmarkAction2 : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        AddFileBookmarkUtil().addBookmark(e, BookmarkType.DIGIT_2)
    }
}

class AddFileBookmarkAction3 : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        AddFileBookmarkUtil().addBookmark(e, BookmarkType.DIGIT_3)
    }
}

class AddFileBookmarkAction4 : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        AddFileBookmarkUtil().addBookmark(e, BookmarkType.DIGIT_4)
    }
}

class AddFileBookmarkAction5 : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        AddFileBookmarkUtil().addBookmark(e, BookmarkType.DIGIT_5)
    }
}

class AddFileBookmarkAction6 : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        AddFileBookmarkUtil().addBookmark(e, BookmarkType.DIGIT_6)
    }
}

class AddFileBookmarkAction7 : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        AddFileBookmarkUtil().addBookmark(e, BookmarkType.DIGIT_7)
    }
}

class AddFileBookmarkAction8 : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        AddFileBookmarkUtil().addBookmark(e, BookmarkType.DIGIT_8)
    }
}

class AddFileBookmarkAction9 : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        AddFileBookmarkUtil().addBookmark(e, BookmarkType.DIGIT_9)
    }
}

class AddFileBookmarkAction0 : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        AddFileBookmarkUtil().addBookmark(e, BookmarkType.DIGIT_0)
    }
}
