package com.kanyideveloper.onboardingscreens.OTP

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import com.kanyideveloper.onboardingscreens.R


class OTPFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_o_t_p2, container, false)

        val btnVerifOTP: Button = view.findViewById(R.id.btnVerifOTP)
        val btnBackToLogin: ImageView = view.findViewById(R.id.btnBackToLogin)

        btnVerifOTP.setOnClickListener {
            findNavController().navigate(R.id.action_OTPFragment_to_loadingScreenFragment)
        }

        btnBackToLogin.setOnClickListener {
            findNavController().navigate(R.id.action_OTPFragment_to_LoginFragment)
        }

        return view
    }


}