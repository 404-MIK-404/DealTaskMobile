package com.dealtaskmobile.data.sharedrefs

import android.content.Context
import com.dealtaskmobile.data.storage.UserStorage
import com.google.gson.Gson


private const val SHARED_PREFS_NAME = "shared_prefs_user"
private const val KEY_FIRST_NAME = "Info User"
private const val DEFAULT_NAME = "NG"

class SharedPrefUserStorage(context: Context) : UserStorage {

    private val sharedPreferences = context.getSharedPreferences(SHARED_PREFS_NAME, Context.MODE_PRIVATE)

    override fun saveUser() {
        TODO("Not yet implemented")
    }

    override fun getUserId(): String {
        TODO("Not yet implemented")
    }


}