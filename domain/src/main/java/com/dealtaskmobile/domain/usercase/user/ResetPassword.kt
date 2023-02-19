package com.dealtaskmobile.domain.usercase.user

import com.dealtaskmobile.domain.repository.UserRepository

class ResetPassword(private val userRepository: UserRepository) {

    fun execute(){
        userRepository.resetPassword()
    }


}