package com.dealtaskmobile.dealtaskapp.di

import android.content.Context
import com.dealtaskmobile.data.FirebaseInstance
import com.dealtaskmobile.data.FirebaseInterfaceUserAction
import com.dealtaskmobile.data.repository.UserRepositoryImpl
import com.dealtaskmobile.data.sharedrefs.SharedPrefUserStorage
import com.dealtaskmobile.data.storage.UserStorage
import com.dealtaskmobile.domain.repository.UserRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DataModule {

    @Provides
    fun provideUserStorage(context: Context) : UserStorage{
        return SharedPrefUserStorage(context = context)
    }

    @Provides
    fun provideFirebaseInterfaceUserAction(firebaseInstance: FirebaseInstance): FirebaseInterfaceUserAction{
        return FirebaseInterfaceUserAction(firebaseInstance = firebaseInstance)
    }

    @Provides
    fun provideFirebaseInstance(): FirebaseInstance{
        return FirebaseInstance()
    }

    @Provides
    fun provideUserRepository(userStorage: UserStorage,firebaseInterfaceUserAction: FirebaseInterfaceUserAction) : UserRepository{
        return UserRepositoryImpl(userStorage = userStorage, firebaseInterfaceUserAction = firebaseInterfaceUserAction)
    }

}