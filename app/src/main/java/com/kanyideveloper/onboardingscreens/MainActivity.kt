package com.kanyideveloper.onboardingscreens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.kanyideveloper.onboardingscreens.Home.Beranda.BerandaFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Hide the ActionBar
        supportActionBar?.hide()

        setFullScreen(window)
        lightStatusBar(window)


      //  replaceFragment (BerandaFragment())



    }

//    private fun replaceFragment(berandaFragment: Fragment) {
//
//        val fragmentManager = supportFragmentManager
//        val fragmentTransaction = fragmentManager.beginTransaction()
//        fragmentTransaction.replace(R.id.layoutHome,berandaFragment)
//        fragmentTransaction.commit()
//    }
}