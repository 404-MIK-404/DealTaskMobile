package com.dealtaskmobile.dealtaskapp.screens

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.lifecycle.ViewModelProvider
import com.dealtaskmobile.dealtaskapp.app.App
import com.dealtaskmobile.dealtaskapp.viewmodel.DealTaskViewModel
import com.dealtaskmobile.dealtaskapp.viewmodel.DealTaskViewModelFactory
import com.dealtaskmobile.domain.models.CreateUserParam
import com.dealtaskmobile.signin.R
import com.dealtaskmobile.signin.databinding.ActivityCreateAccountBinding
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.SignInButton
import com.google.android.gms.common.api.ApiException
import com.google.firebase.auth.GoogleAuthProvider
import com.google.firebase.database.core.utilities.Utilities
import org.apache.commons.codec.digest.DigestUtils
import org.w3c.dom.Text
import javax.inject.Inject

class CreateAccountActivity : AppCompatActivity() {

    @Inject
    lateinit var vmFactory: DealTaskViewModelFactory

    private lateinit var vm: DealTaskViewModel

    private lateinit var binding: ActivityCreateAccountBinding

    private lateinit var enterUserNameCR: EditText

    private lateinit var enterEmailAddressCR: EditText

    private lateinit var enterPasswordCR: EditText

    private lateinit var enterPasswordRepeatCR: EditText



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateAccountBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_create_account)
        init()
        (applicationContext as App).appComponent.inject(this)
        vm = ViewModelProvider(this,vmFactory).get(DealTaskViewModel::class.java)
    }


    fun init(){
        enterUserNameCR = findViewById(R.id.enterUserNameCR)
        enterEmailAddressCR = findViewById(R.id.enterEmailAddressCR)
        enterPasswordCR = findViewById(R.id.enterPasswordCR)
        enterPasswordRepeatCR = findViewById(R.id.enterPasswordRepeatCR)

    }

    fun BackSignInActivity(view: View){
        startActivity(Intent(this, SignInActivity::class.java))
    }

    fun TestCreateAccount(view: View) : Unit {
        if(!TextUtils.isEmpty(enterPasswordCR.text) && !TextUtils.isEmpty(enterPasswordRepeatCR.text)){
            var userCreate = CreateUserParam(username = enterUserNameCR.text.toString(), emailUser = enterEmailAddressCR.text.toString() , passwordUser = DigestUtils.md5Hex(enterUserNameCR.text.toString()+enterPasswordCR.text.toString()).lowercase())
            vm.createAccount(param = userCreate)
        } else {
            Toast.makeText(this,"Пустота",Toast.LENGTH_SHORT).show()
        }
    }


}