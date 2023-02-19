package com.dealtaskmobile.domain.repository

import com.dealtaskmobile.domain.models.SaveUserParam

interface UserRepository {

    fun signInAccount(param: SaveUserParam)
    fun createAccount()
    fun getUserId()
    fun resetPassword()

}