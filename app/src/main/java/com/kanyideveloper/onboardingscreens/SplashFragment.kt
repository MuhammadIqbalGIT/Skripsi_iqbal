package com.kanyideveloper.onboardingscreens

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController

class SplashFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {



        val view = inflater.inflate(R.layout.fragment_splash, container, false)

        Handler().postDelayed({


            if (onBoardingFinished()){
                findNavController().navigate(R.id.action_splashFragment_to_homeFragment2)
            }else{
                findNavController().navigate(R.id.action_splashFragment_to_viewPagerAdapter)
            }
        },2000)


        return view

    }

    private fun onBoardingFinished(): Boolean{
        val sharedPref: SharedPreferences = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        return sharedPref.getBoolean("Finished",false)
    }
}