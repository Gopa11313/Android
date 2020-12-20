package com.example.noteasap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import com.example.noteasap.fragments.BookmarkBlankFragment
import com.example.noteasap.fragments.HomeBlankFragment
import com.example.noteasap.fragments.accountBlankFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

private lateinit var frament_container:FrameLayout;
private val Home=HomeBlankFragment();
private val Bookmark= BookmarkBlankFragment();
private val Account=accountBlankFragment();
private lateinit var bottom_navigation:BottomNavigationView;
class Third_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_)
        replaceFragments(Home)
         frament_container=findViewById(R.id.fragment_container)
     bottom_navigation=findViewById(R.id.bottom_navigation);
     bottom_navigation.setOnNavigationItemSelectedListener(){
        when(it.itemId){
            R.id.ic_home->replaceFragments(Home)
            R.id.ic_bookmark->replaceFragments(Bookmark)
            R.id.ic_account->replaceFragments(Account)
        }
        true;
    }
    }
    fun replaceFragments(fragment:Fragment){
        if(fragment!=null){
            val transaction=supportFragmentManager.beginTransaction();
            transaction.replace(R.id.fragment_container,fragment) //only use this here
            transaction.commit();
        }
    }
}
