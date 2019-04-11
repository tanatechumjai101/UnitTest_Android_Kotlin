package com.example.unittest.login

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.example.unittest.R
import kotlinx.android.synthetic.main.activity_main.*

class LoginActivity : AppCompatActivity() {

    private lateinit var vm: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        vm = ViewModelProviders.of(this).get(LoginViewModel::class.java)

//        vm.context = this@LoginActivity

        btnSubmit.setOnClickListener {
            var x = vm.login("Why", "1234")

            if (x) {
                Toast.makeText(this@LoginActivity, "Welcome", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this@LoginActivity, "Fail", Toast.LENGTH_SHORT).show()
            }
        }


    }

    private fun init() {
    }

}
