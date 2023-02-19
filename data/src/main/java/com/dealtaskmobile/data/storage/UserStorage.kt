package com.dealtaskmobile.data.storage

interface UserStorage {

    fun saveUser()
    fun getUserId() : String

}