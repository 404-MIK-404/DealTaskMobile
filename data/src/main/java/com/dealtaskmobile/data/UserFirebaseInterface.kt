package com.dealtaskmobile.data

import com.dealtaskmobile.domain.models.CreateUserParam
import com.dealtaskmobile.domain.models.SaveUserParam
import com.google.android.gms.auth.api.signin.GoogleSignInOptions

interface UserFirebaseInterface {

    fun enterAccount(param: SaveUserParam)
    fun createAccount(param: CreateUserParam)

    fun getClientSignInGoogle(idTok: String): GoogleSignInOptions

}