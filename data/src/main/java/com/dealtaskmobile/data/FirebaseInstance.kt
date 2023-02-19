package com.dealtaskmobile.data

import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class FirebaseInstance {

    companion object{

        fun getFirebaseInstance(): FirebaseDatabase {
            return FirebaseDatabase.getInstance()
        }

    }

    fun getReference(): DatabaseReference {
        return getFirebaseInstance().getReference("Users")
    }


}