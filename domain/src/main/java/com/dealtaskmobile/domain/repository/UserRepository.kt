package com.dealtaskmobile.domain.repository

import com.dealtaskmobile.domain.models.CreateUserParam
import com.dealtaskmobile.domain.models.SaveUserParam

interface UserRepository {

    fun signInAccount(param: SaveUserParam)
    fun createAccount(param: CreateUserParam)
    fun getUserId()
    fun resetPassword()

}