package com.dealtaskmobile.dealtaskapp.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.dealtaskmobile.domain.models.CreateUserParam
import com.dealtaskmobile.domain.models.SaveUserGoogleParam
import com.dealtaskmobile.domain.models.SaveUserParam
import com.dealtaskmobile.domain.usercase.clientgoogle.GetClientSignInGoogle
import com.dealtaskmobile.domain.usercase.clientgoogle.SignInGoogleAuth
import com.dealtaskmobile.domain.usercase.user.CreateAccount
import com.dealtaskmobile.domain.usercase.user.GetUserId
import com.dealtaskmobile.domain.usercase.user.ResetPassword
import com.dealtaskmobile.domain.usercase.user.SignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInOptions

class DealTaskViewModel constructor(private val createAccount: CreateAccount,
                                    private val getUserId: GetUserId,
                                    private val resetPassword: ResetPassword,
                                    private val signInAccount: SignInAccount,
                                    private val getClientSignInGoogle: GetClientSignInGoogle,
                                    private val signInGoogleAuth: SignInGoogleAuth
                                    )
    : ViewModel()
{

    init {
        Log.e("Log VM","VM create")
    }


    override fun onCleared() {
        Log.e("Log VM","VM clear")
        super.onCleared()
    }

    fun enterAccount(param: SaveUserParam){
        signInAccount.execute(param = param)
    }

    fun createAccount(param: CreateUserParam){
        createAccount.execute(param = param)
    }

    fun getClientSignInGoogleParam(idTok: String): GoogleSignInOptions {
        return getClientSignInGoogle.execute(idTok = idTok)
    }

    fun enterGoogleAccount(param: SaveUserGoogleParam){
        signInGoogleAuth.execute(saveUserGoogleParam=param)
    }


}