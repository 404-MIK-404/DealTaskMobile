package com.dealtaskmobile.dealtaskapp.di

import com.dealtaskmobile.dealtaskapp.screens.CreateAccountActivity
import com.dealtaskmobile.dealtaskapp.screens.HomeActivity
import com.dealtaskmobile.dealtaskapp.screens.SignInActivity
import dagger.Component

@Component(modules = [AppModule::class,DataModule::class,DomainModule::class])
interface AppComponent {

    fun inject(singInActivity: SignInActivity)
    fun inject(createAccountActivity: CreateAccountActivity)
    fun inject(homeActivity: HomeActivity)

}