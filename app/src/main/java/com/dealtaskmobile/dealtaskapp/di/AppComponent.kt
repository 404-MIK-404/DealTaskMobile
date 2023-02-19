package com.dealtaskmobile.dealtaskapp.di

import com.dealtaskmobile.dealtaskapp.screens.SignInActivity
import dagger.Component

@Component(modules = [AppModule::class,DataModule::class,DomainModule::class])
interface AppComponent {

    fun inject(singInActivity: SignInActivity)

}