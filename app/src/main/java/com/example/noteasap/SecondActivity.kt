package com.example.noteasap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.nio.file.attribute.AclEntryFlag

private lateinit var notif: Button;
var flag=false;
class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        notif=findViewById(R.id.notif_Button);

        notif.setOnClickListener(){
            flag=true;
            nexatact();
        }
    }
    fun nexatact(){
        startActivity(Intent(this,Third_Activity::class.java))
        finish();
    }
}