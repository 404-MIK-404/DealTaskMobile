package com.dealtaskmobile.dealtaskapp.screens

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.dealtaskmobile.signin.R

class SplashActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        init()
    }


    fun init(){
        Handler().postDelayed(Runnable {
            startActivity(Intent(this, SignInActivity::class.java))
            finish()
        },3 * 1000)
    }

}