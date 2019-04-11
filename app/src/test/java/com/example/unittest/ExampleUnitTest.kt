package com.example.unittest

import android.content.Context
import com.example.unittest.login.LoginViewModel
import org.junit.Assert
import org.junit.Test


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */

class ExampleUnitTest {
    private val loginViewModel: LoginViewModel by lazy { LoginViewModel() }

    @Test
    fun loginTest() {
        Assert.assertTrue(loginViewModel.login("admin","1234"))

    }
    @Test
    fun  checkLoginFail(){
        Assert.assertFalse(loginViewModel.login("admin1","1234"))
    }
}
