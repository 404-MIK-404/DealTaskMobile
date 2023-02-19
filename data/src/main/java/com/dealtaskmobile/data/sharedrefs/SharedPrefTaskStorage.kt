package com.dealtaskmobile.data.sharedrefs

import android.content.Context
import com.dealtaskmobile.data.storage.TaskStorage


private const val SHARED_PREFS_NAME = "shared_prefs_task_user"
private const val KEY_FIRST_NAME = "Task User"
private const val DEFAULT_NAME = "NG"

class SharedPrefTaskStorage(context: Context) : TaskStorage {

    private val sharedPreferences = context.getSharedPreferences(SHARED_PREFS_NAME, Context.MODE_PRIVATE)

    override fun saveTask() {
        TODO("Not yet implemented")
    }

    override fun editTask() {
        TODO("Not yet implemented")
    }

    override fun deleteTask() {
        TODO("Not yet implemented")
    }


}