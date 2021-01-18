package com.mazaevalexey.spaceapp.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.mazaevalexey.spaceapp.R


class MainActivity : AppCompatActivity() {
    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        bottomNavigationView = findViewById(R.id.navigation_view)
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when(item.itemId) {
                R.id.feed -> {
                    openFragment(Fragment()) // todo - feed fragment
                    true
                }
                R.id.search -> {
                    openFragment(Fragment()) // todo - search fragment
                    true
                }
                R.id.settings -> {
                    openFragment(Fragment()) // todo - settings fragment
                    true
                }
                else -> false
            }
        }
    }

    private fun openFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .add(R.id.host_frame, fragment)
            .commit()
    }
}