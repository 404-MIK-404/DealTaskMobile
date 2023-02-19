package com.dealtaskmobile.data.repository

import com.dealtaskmobile.data.FirebaseInterfaceUserAction
import com.dealtaskmobile.data.storage.UserStorage
import com.dealtaskmobile.domain.models.SaveUserParam
import com.dealtaskmobile.domain.repository.UserRepository

class UserRepositoryImpl(private val userStorage: UserStorage,private val firebaseInterfaceUserAction: FirebaseInterfaceUserAction) : UserRepository {

    override fun signInAccount(param: SaveUserParam) {
        firebaseInterfaceUserAction.enterAccount()
    }

    override fun createAccount() {
        TODO("Not yet implemented")
    }

    override fun getUserId() {
        TODO("Not yet implemented")
    }

    override fun resetPassword() {
        TODO("Not yet implemented")
    }
}