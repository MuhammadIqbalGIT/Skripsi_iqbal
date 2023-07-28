package com.kanyideveloper.onboardingscreens.onboarding.screens

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.kanyideveloper.onboardingscreens.R

class Screen3 : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_screen3, container, false)

        val finish: TextView = view.findViewById(R.id.finish)

        finish.setOnClickListener {
            findNavController().navigate(R.id.action_viewPagerAdapter_to_homeFragment)
            onBoardingDone()
        }
        return view
    }

    //To save the state of onboarding if it is done
    private fun onBoardingDone(){
        val sharedPref: SharedPreferences = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        editor.putBoolean("Finished",true)
        editor.apply()
    }
}