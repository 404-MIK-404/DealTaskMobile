package com.dealtaskmobile.domain.usercase.user

import com.dealtaskmobile.domain.models.SaveUserParam
import com.dealtaskmobile.domain.repository.UserRepository

class SignInAccount(private val userRepository: UserRepository) {

    fun execute(param: SaveUserParam){
        userRepository.signInAccount(param = param)
    }

}