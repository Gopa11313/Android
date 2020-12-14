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
//private lateinit var home_nav:MenuItem;
//private lateinit var bookmark_nav:MenuItem;
//private lateinit var account_nav:MenuItem;
class Third_Activity : AppCompatActivity() {
 //// why can't i use this here
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//    home_nav=findViewById(R.id.home)
//    bookmark_nav=findViewById(R.id.bookmark)
//    account_nav=findViewById(R.id.account)
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
    private fun replaceFragments(fragment: Fragment){
        if(fragment!=null){
            val transaction=supportFragmentManager.beginTransaction();
            transaction.replace(R.id.fragment_container,fragment) //only use this here
            transaction.commit();
        }
    }
}
