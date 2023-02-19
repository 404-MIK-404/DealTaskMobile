package com.dealtaskmobile.dealtaskapp.app

import android.app.Application
import com.dealtaskmobile.dealtaskapp.di.AppComponent
import com.dealtaskmobile.dealtaskapp.di.AppModule
import com.dealtaskmobile.dealtaskapp.di.DaggerAppComponent

class App : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent
            .builder()
            .appModule(AppModule(context = this)).build()
    }

}