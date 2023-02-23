package com.dealtaskmobile.data

import com.dealtaskmobile.domain.models.CreateUserParam
import com.dealtaskmobile.domain.models.SaveUserGoogleParam
import com.dealtaskmobile.domain.models.SaveUserParam
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions

class FirebaseInterfaceUserAction(private val firebaseInstance: FirebaseInstance) : UserFirebaseInterface {

    override fun enterAccount(param: SaveUserParam) {
        var reference = firebaseInstance.getReference()
        reference.child(param.passwordUser).get().addOnSuccessListener {
            if (it.value == null){
                System.out.println("Получается что пусто: $it")
            } else {
                System.out.println("Не пусто: $it")
                System.out.println("Пароль: " + it.child("passwordUser").value)
            }
        }
    }

    override fun createAccount(param: CreateUserParam) {
        var reference = firebaseInstance.getReference()
        reference.child(param.passwordUser).get().addOnSuccessListener {
            if (it.value == null){
                reference.child(param.passwordUser).child("username").setValue(param.username)
                reference.child(param.passwordUser).child("email").setValue(param.emailUser)
            } else {
                System.out.println("Не создаём, так как он уже был создан !")
            }
        }
    }

    override fun getClientSignInGoogle(idTok: String): GoogleSignInOptions {
       return GoogleSignInOptions
           .Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
           .requestIdToken(idTok)
           .requestEmail()
           .build()
    }

    override fun enterGoogleAccount(param: SaveUserGoogleParam) {
        var reference = firebaseInstance.getReference()
        reference.child(param.idUser).get().addOnSuccessListener {
            if (it.value == null){
                reference.child(param.idUser).child("username").setValue(param.username)
                reference.child(param.idUser).child("email").setValue(param.emailUser)
            } else {
                System.out.println("Не создаём, так как он уже был создан !")
            }
        }
    }


}