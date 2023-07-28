package com.kanyideveloper.onboardingscreens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_login, container, false)
        val btnSendOTP: Button = view.findViewById(R.id.btnSendOTP)

        btnSendOTP.setOnClickListener {
            findNavController().navigate(R.id.action_LoginFragment_to_OTPFragment)
        }
        return view
    }
}