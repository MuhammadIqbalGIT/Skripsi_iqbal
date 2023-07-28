package com.kanyideveloper.onboardingscreens.onboarding.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.kanyideveloper.onboardingscreens.R

class Screen2 : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_screen2, container, false)

        val viewPager: ViewPager2? = activity?.findViewById(R.id.viewPager2)
        val next2: TextView = view.findViewById(R.id.next2)

        next2.setOnClickListener {
            viewPager?.currentItem = 2
        }

        val btnSkipTwo : Button = view.findViewById(R.id.btnskipTwo)

        btnSkipTwo.setOnClickListener { findNavController().navigate(R.id.action_viewPagerAdapter_to_homeFragment) }

        return view
    }
}