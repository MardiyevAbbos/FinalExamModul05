package com.example.finalexammodul05.activity

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.finalexammodul05.R
import com.example.finalexammodul05.manager.SharedPref

@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        initViews()


    }

    private fun initViews() {
        val handler = Handler()
        handler.postDelayed({
            if (SharedPref(this).isSaved) {
                Intent(this, RestaurantActivity::class.java).also {
                    startActivity(it)
                    finish()
                }
            } else {
                Intent(this, MainActivity::class.java).also {
                    startActivity(it)
                    finish()
                }
            }
        }, 4000)
    }

}