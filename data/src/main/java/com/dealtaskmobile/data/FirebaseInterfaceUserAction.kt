package com.dealtaskmobile.data

class FirebaseInterfaceUserAction(private val firebaseInstance: FirebaseInstance) : UserFirebaseInterface {

    override fun enterAccount() {
        firebaseInstance.getReference()
    }

    override fun createAccount() {
        TODO("Not yet implemented")
    }


}