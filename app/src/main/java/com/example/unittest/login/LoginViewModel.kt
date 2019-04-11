package com.example.unittest.login

import android.arch.lifecycle.ViewModel
import android.content.Context
import android.widget.Toast

class LoginViewModel : ViewModel() {


    fun login(username: String, password: String): Boolean {
        return username == "admin" && password == "1234"
    }
}