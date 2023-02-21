package com.dealtaskmobile.dealtaskapp.di

import com.dealtaskmobile.domain.repository.UserRepository
import com.dealtaskmobile.domain.usercase.clientgoogle.GetClientSignInGoogle
import com.dealtaskmobile.domain.usercase.user.CreateAccount
import com.dealtaskmobile.domain.usercase.user.GetUserId
import com.dealtaskmobile.domain.usercase.user.ResetPassword
import com.dealtaskmobile.domain.usercase.user.SignInAccount
import dagger.Module
import dagger.Provides

@Module
class DomainModule {


    @Provides
    fun provideCreateAccount(userRepository: UserRepository) : CreateAccount{
        return CreateAccount(userRepository = userRepository)
    }

    @Provides
    fun provideGetUserId(userRepository: UserRepository): GetUserId{
        return GetUserId(userRepository = userRepository)
    }

    @Provides
    fun provideResetPassword(userRepository: UserRepository): ResetPassword{
        return ResetPassword(userRepository = userRepository)
    }

    @Provides
    fun provideSignInAccount(userRepository: UserRepository): SignInAccount{
        return SignInAccount(userRepository = userRepository)
    }

    @Provides
    fun provideGetClientSignInGoogle(userRepository: UserRepository): GetClientSignInGoogle {
        return GetClientSignInGoogle(userRepository = userRepository)
    }


}