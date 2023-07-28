package com.kanyideveloper.onboardingscreens.OTP

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kanyideveloper.onboardingscreens.R

class OTPActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otpactivity)

        val fragmentid = OTPFragment()
        val fragment = supportFragmentManager.findFragmentByTag(OTPFragment::class.java.simpleName)


        if (fragment !is OTPFragment) {
            supportFragmentManager.beginTransaction()
                .add(R.id.container, fragmentid, OTPFragment::class.java.simpleName)
                .commit()
        }
    }
}