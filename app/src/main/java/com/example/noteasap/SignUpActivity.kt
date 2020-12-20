package com.example.noteasap

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import javax.microedition.khronos.egl.EGLDisplay
private lateinit var fullname:EditText;
private lateinit var email:EditText;
private lateinit var pass:EditText;
private lateinit var con_pass:EditText;
private lateinit var termsnCon:CheckBox;
private  lateinit var register:Button;
private lateinit var already:TextView;
private val emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"
class SignUpActivity : AppCompatActivity(), View.OnClickListener  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        fullname=findViewById(R.id.fullName)
        email=findViewById(R.id.email);
        pass=findViewById(R.id.pass);
        con_pass=findViewById(R.id.con_pss)
        pass=findViewById(R.id.pass);
        termsnCon=findViewById(R.id.termsnCon);
        register=findViewById(R.id.reister);
        already=findViewById(R.id.already)
        register.setOnClickListener(this);
        already.setOnClickListener(this);
    }

    override fun onClick(p: View?) {
        when(p?.id){
            R.id.reister->{
                validate()
            }
            R.id.already->{
                nextact()
            }
        }
    }
    fun validate() {
        val pas = pass.text.toString();
        val cpass = con_pass.text.toString();
        val em =email.text.toString()
            if (em.matches(emailPattern.toRegex())) {
                if(pas==cpass){
                    if(termsnCon.isChecked){
                        Toast.makeText(this, "validated", Toast.LENGTH_SHORT).show()
                    }
                    else{
                        Toast.makeText(this,"Please check the terms and condition button.",Toast.LENGTH_LONG).show();
                    }
                }
                else{
                    Toast.makeText(this,"Password and con-password is not matched",Toast.LENGTH_LONG).show()
                }
            }
        else{
                Toast.makeText(this, "invalid emaial", Toast.LENGTH_SHORT).show()
            }
    }
    fun nextact(){
        startActivity(Intent(this,LoginActivity::class.java))
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }
}