package com.kanyideveloper.onboardingscreens.loadingscreen

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.kanyideveloper.onboardingscreens.R


class LoadingScreenFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_loading_screen, container, false)


        Handler(Looper.myLooper()!!).postDelayed({

            findNavController().navigate(R.id.action_loadingScreenFragment_to_homeActivity)

        }, 2000)


        return view
    }

}