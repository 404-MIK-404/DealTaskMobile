package com.dealtaskmobile.dealtaskapp.screens

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.dealtaskmobile.dealtaskapp.app.App
import com.dealtaskmobile.dealtaskapp.viewmodel.DealTaskViewModel
import com.dealtaskmobile.dealtaskapp.viewmodel.DealTaskViewModelFactory
import com.dealtaskmobile.domain.models.SaveUserParam
import com.dealtaskmobile.signin.R
import com.dealtaskmobile.signin.databinding.ActivitySignInBinding
import kotlinx.android.synthetic.main.activity_sign_in.view.*
import javax.inject.Inject

class SignInActivity : AppCompatActivity() {

    @Inject
    lateinit var vmFactory: DealTaskViewModelFactory

    lateinit var binding: ActivitySignInBinding

    private var editTextEmailAddress : EditText? = null;

    private var editTextPassword : EditText? = null;

    private lateinit var vm: DealTaskViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_sign_in)
        init()
        (applicationContext as App).appComponent.inject(this)

        vm = ViewModelProvider(this,vmFactory).get(DealTaskViewModel::class.java)
    }


    private fun init() {
        editTextPassword = findViewById(R.id.editTextPassword)
        editTextEmailAddress = findViewById(R.id.editTextEmailAddress)
    }


    fun SignInClick(view: View)  : Unit {
        var text: String = editTextEmailAddress?.text.toString()
        Toast.makeText(this@SignInActivity,text,Toast.LENGTH_SHORT).show()
        val userParam = SaveUserParam(emailUser = editTextEmailAddress?.text.toString(),editTextPassword?.text.toString())
        vm.enterAccount(param = userParam)
        Toast.makeText(this@SignInActivity,userParam.toString(),Toast.LENGTH_SHORT).show()
    }

    fun CreateAccountFormClick(view: View){
        startActivity(Intent(this, CreateAccountActivity::class.java))
    }

}