package com.dealtaskmobile.domain.usercase.user

import com.dealtaskmobile.domain.repository.UserRepository

class GetUserId(private val userRepository: UserRepository) {

    fun execute(){
        userRepository.getUserId()
    }

}