package com.dealtaskmobile.dealtaskapp.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.dealtaskmobile.domain.models.SaveUserParam
import com.dealtaskmobile.domain.usercase.user.CreateAccount
import com.dealtaskmobile.domain.usercase.user.GetUserId
import com.dealtaskmobile.domain.usercase.user.ResetPassword
import com.dealtaskmobile.domain.usercase.user.SignInAccount

class DealTaskViewModel constructor(private val createAccount: CreateAccount,
                                    private val getUserId: GetUserId,
                                    private val resetPassword: ResetPassword,
                                    private val signInAccount: SignInAccount
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


}