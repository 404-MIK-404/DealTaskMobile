package com.dealtaskmobile.dealtaskapp.screens

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.dealtaskmobile.signin.R

class CreateAccountActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)
    }


    fun BackSignInActivity(view: View){
        startActivity(Intent(this, SignInActivity::class.java))
    }



}