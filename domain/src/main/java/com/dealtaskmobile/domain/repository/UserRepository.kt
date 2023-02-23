package com.dealtaskmobile.domain.repository

import com.dealtaskmobile.domain.models.CreateUserParam
import com.dealtaskmobile.domain.models.SaveUserGoogleParam
import com.dealtaskmobile.domain.models.SaveUserParam
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions

interface UserRepository {

    fun signInAccount(param: SaveUserParam)
    fun createAccount(param: CreateUserParam)
    fun enterGoogleAccount(param: SaveUserGoogleParam)


    fun getUserId()
    fun resetPassword()

    fun getClientSignInGoogle(idTok: String): GoogleSignInOptions



}