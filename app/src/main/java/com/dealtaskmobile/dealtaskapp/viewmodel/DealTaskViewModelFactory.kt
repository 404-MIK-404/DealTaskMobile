package com.dealtaskmobile.dealtaskapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.dealtaskmobile.domain.usercase.clientgoogle.GetClientSignInGoogle
import com.dealtaskmobile.domain.usercase.user.CreateAccount
import com.dealtaskmobile.domain.usercase.user.GetUserId
import com.dealtaskmobile.domain.usercase.user.ResetPassword
import com.dealtaskmobile.domain.usercase.user.SignInAccount

class DealTaskViewModelFactory(
    val createAccount: CreateAccount,
    val getUserId: GetUserId,
    val resetPassword: ResetPassword,
    val signInAccount: SignInAccount,
    val getClientSignInGoogle: GetClientSignInGoogle

    ): ViewModelProvider.Factory {


    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return DealTaskViewModel(
            createAccount,getUserId,resetPassword,signInAccount,getClientSignInGoogle
        ) as T
    }
}