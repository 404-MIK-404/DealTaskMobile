package com.dealtaskmobile.domain.usercase.clientgoogle

import com.dealtaskmobile.domain.repository.UserRepository
import com.google.android.gms.auth.api.signin.GoogleSignInOptions

class GetClientSignInGoogle(private val userRepository: UserRepository) {

    fun execute(idTok: String) : GoogleSignInOptions {
       return userRepository.getClientSignInGoogle(idTok = idTok)
    }

}