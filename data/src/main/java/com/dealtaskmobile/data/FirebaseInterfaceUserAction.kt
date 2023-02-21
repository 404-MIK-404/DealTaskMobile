package com.dealtaskmobile.data

import com.dealtaskmobile.domain.models.CreateUserParam
import com.dealtaskmobile.domain.models.SaveUserParam
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions

class FirebaseInterfaceUserAction(private val firebaseInstance: FirebaseInstance) : UserFirebaseInterface {

    override fun enterAccount(param: SaveUserParam) {
        var reference = firebaseInstance.getReference()
        reference.child(param.emailUser).get().addOnSuccessListener {
            if (it.value == null){
                System.out.println("Получается что пусто: $it")
            } else {
                System.out.println("Не пусто: $it")
                System.out.println("Пароль: " + it.child("passwordUser").value)
            }
        }

        //reference.child(param.emailUser).setValue(param)
        //var reference = firebaseInstance.getReference()
        //reference.push().setValue(param)
    }

    override fun createAccount(param: CreateUserParam) {
        try {
            var reference = firebaseInstance.getReference()
            reference.child(param.username).get().addOnSuccessListener {
                if (it.value == null){
                    System.out.println("Создаём пользователя !")
                    reference.child(param.username).setValue(param)
                } else {
                    System.out.println("Не создаём, так как он уже был создан !")
                }
            }
        } catch (ex: java.lang.RuntimeException){
            System.out.println(ex.toString())
        }
    }

    override fun getClientSignInGoogle(idTok: String): GoogleSignInOptions {
       return GoogleSignInOptions
           .Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
           .requestIdToken(idTok)
           .requestEmail()
           .build()
    }


}