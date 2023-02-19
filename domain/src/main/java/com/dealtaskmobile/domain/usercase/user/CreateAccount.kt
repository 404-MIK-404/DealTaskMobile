package com.dealtaskmobile.domain.usercase.user

import com.dealtaskmobile.domain.repository.UserRepository

class CreateAccount(private val userRepository: UserRepository) {

    fun execute(){
        userRepository.createAccount()
    }

}