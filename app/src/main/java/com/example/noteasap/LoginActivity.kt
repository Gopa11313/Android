package com.example.noteasap

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

private lateinit var signup:Button;
private lateinit var forgetpassword:TextView;
private val forget= ForgetpasswordFragment();
class LoginActivity : AppCompatActivity(), View.OnClickListener  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        signup=findViewById(R.id.signup)
        forgetpassword=findViewById(R.id.forgetpassword);
        signup.setOnClickListener(this);
        forgetpassword.setOnClickListener(this);

    }

    override fun onClick(p: View?) {
        when(p?.id){
            R.id.signup -> {
                nextact();
            }
            R.id.forgetpassword -> {
                if(forget!=null){
                    getSupportFragmentManager().beginTransaction()
                        .add(android.R.id.content, com.example.noteasap.forget).commit()
                }
            }
        }
    }
    fun nextact(){
        startActivity(Intent(this, SignUpActivity::class.java))
    }

}