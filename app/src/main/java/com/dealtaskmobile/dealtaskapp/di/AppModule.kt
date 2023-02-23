package com.dealtaskmobile.dealtaskapp.di

import android.content.Context
import com.dealtaskmobile.dealtaskapp.viewmodel.DealTaskViewModelFactory
import com.dealtaskmobile.domain.usercase.clientgoogle.GetClientSignInGoogle
import com.dealtaskmobile.domain.usercase.clientgoogle.SignInGoogleAuth
import com.dealtaskmobile.domain.usercase.user.CreateAccount
import com.dealtaskmobile.domain.usercase.user.GetUserId
import com.dealtaskmobile.domain.usercase.user.ResetPassword
import com.dealtaskmobile.domain.usercase.user.SignInAccount
import dagger.Module
import dagger.Provides


@Module
class AppModule(val context: Context) {

    @Provides
    fun provideContext() : Context {
        return context
    }

    @Provides
    fun provideDealTaskViewModelFactory(createAccount: CreateAccount,
                                        getUserId: GetUserId,
                                        resetPassword: ResetPassword,
                                        signInAccount: SignInAccount,
                                        getClientSignInGoogle: GetClientSignInGoogle,
                                        signInGoogleAuth: SignInGoogleAuth
    ): DealTaskViewModelFactory {
        return DealTaskViewModelFactory(createAccount,getUserId,resetPassword,
                                        signInAccount,getClientSignInGoogle,signInGoogleAuth)
    }






}