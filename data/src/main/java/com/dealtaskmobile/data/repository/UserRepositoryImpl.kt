package com.dealtaskmobile.data.repository

import com.dealtaskmobile.data.FirebaseInterfaceUserAction
import com.dealtaskmobile.data.storage.UserStorage
import com.dealtaskmobile.domain.models.CreateUserParam
import com.dealtaskmobile.domain.models.SaveUserGoogleParam
import com.dealtaskmobile.domain.models.SaveUserParam
import com.dealtaskmobile.domain.repository.UserRepository
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions

class UserRepositoryImpl(private val userStorage: UserStorage,private val firebaseInterfaceUserAction: FirebaseInterfaceUserAction) : UserRepository {

    override fun signInAccount(param: SaveUserParam) {
        firebaseInterfaceUserAction.enterAccount(param = param)
    }

    override fun createAccount(param: CreateUserParam) {
        firebaseInterfaceUserAction.createAccount(param = param)
    }

    override fun enterGoogleAccount(param: SaveUserGoogleParam) {
        firebaseInterfaceUserAction.enterGoogleAccount(param = param)
    }

    override fun getUserId() {
        TODO("Not yet implemented")
    }

    override fun resetPassword() {
        TODO("Not yet implemented")
    }

    override fun getClientSignInGoogle(idTok: String): GoogleSignInOptions {
        return firebaseInterfaceUserAction.getClientSignInGoogle(idTok = idTok)
    }
}