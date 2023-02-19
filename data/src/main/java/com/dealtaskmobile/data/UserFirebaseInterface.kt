package com.dealtaskmobile.data

import com.dealtaskmobile.domain.models.CreateUserParam
import com.dealtaskmobile.domain.models.SaveUserParam

interface UserFirebaseInterface {

    fun enterAccount(param: SaveUserParam)
    fun createAccount(param: CreateUserParam)

}