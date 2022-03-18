package com.example.finalexammodul05.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.finalexammodul05.R
import com.example.finalexammodul05.fragment.CollectionsFragment
import com.example.finalexammodul05.fragment.HomeFragment
import com.example.finalexammodul05.fragment.MessagesFragment
import com.example.finalexammodul05.fragment.SearchFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class RestaurantActivity : AppCompatActivity() {

    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurant)

        initViews()

    }

    private fun initViews() {

        setCurrentFragment(HomeFragment().newInstance())

        bottomNavigationView = findViewById(R.id.bottomNavigationView)
        bottomNavigationView.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.home -> setCurrentFragment(HomeFragment().newInstance())
                R.id.collections -> setCurrentFragment(CollectionsFragment().newInstance())
                R.id.messages -> setCurrentFragment(MessagesFragment().newInstance())
                R.id.search -> setCurrentFragment(SearchFragment().newInstance())
            }
            true
        }

    }

    private fun setCurrentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl_for_fragment, fragment)
            commit()
        }
    }

}