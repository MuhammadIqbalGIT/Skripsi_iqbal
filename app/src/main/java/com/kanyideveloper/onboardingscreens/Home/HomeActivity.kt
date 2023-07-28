package com.kanyideveloper.onboardingscreens.Home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI.setupWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.kanyideveloper.onboardingscreens.Home.Beranda.BerandaFragment
import com.kanyideveloper.onboardingscreens.ListRequest.Request
import com.kanyideveloper.onboardingscreens.ListRequest.RequestPickUpAdapter
import com.kanyideveloper.onboardingscreens.R
import com.kanyideveloper.onboardingscreens.lightStatusBar
import com.kanyideveloper.onboardingscreens.setFullScreen

class HomeActivity : AppCompatActivity() {


    private lateinit var navController: NavController

//    private lateinit var rvReq : RecyclerView
//    private val list = ArrayList<Request>()
//    private var rvreqdata : RecyclerView = findViewById(R.id.recyclerViewListRequest)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(
            R.layout.activity_home
        )

        supportActionBar?.hide()
        setFullScreen(window)
        lightStatusBar(window)


        val navHostFragment =
            supportFragmentManager.findFragmentById(
                R.id.mainContainer
            ) as NavHostFragment
        navController = navHostFragment.navController

        val bottomNavigationView = findViewById<BottomNavigationView>(
            R
                .id.bottomNavigationView
        )
        setupWithNavController(bottomNavigationView, navController)

        // replaceFragment(BerandaFragment())

    }

//    private fun replaceFragment(berandaFragment: Fragment) {
//
//        val fragmentManager = supportFragmentManager
//        val fragmentTransaction = fragmentManager.beginTransaction()
//        fragmentTransaction.replace(R.id.layoutHome, berandaFragment)
//        fragmentTransaction.commit()
//
//    }

}