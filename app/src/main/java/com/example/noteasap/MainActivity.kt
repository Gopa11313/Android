package com.example.noteasap

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import java.util.*


private lateinit var Image1:ImageView;
//private lateinit var Image2:ImageView;
private lateinit var fadein:Animation;
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Image1=findViewById(R.id.Image1)
//        Image2=findViewById(R.id.Image2)
        fadein=AnimationUtils.loadAnimation(this, R.anim.fade_in)
        Image1.startAnimation(fadein)
        Handler(Looper.getMainLooper()).postDelayed(object : Runnable {
            override fun run() {
                val intent = Intent(this@Splash, MainActivity::class.java)
            }
        }, 4000)




    }

}