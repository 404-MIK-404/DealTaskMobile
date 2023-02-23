package com.dealtaskmobile.domain.usercase.clientgoogle

import com.dealtaskmobile.domain.models.SaveUserGoogleParam
import com.dealtaskmobile.domain.repository.UserRepository

class SignInGoogleAuth(private val userRepository: UserRepository) {


    fun execute(saveUserGoogleParam: SaveUserGoogleParam){
        userRepository.enterGoogleAccount(param = saveUserGoogleParam)
    }

}