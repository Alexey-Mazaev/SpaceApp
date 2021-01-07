package com.mazaevalexey.spaceapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mazaevalexey.spaceapp.ui.astronomydaypicture.AstronomyDayPictureFragment


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        val dayPhotoFragment = AstronomyDayPictureFragment()
        supportFragmentManager.beginTransaction()
                .add(R.id.host_frame, dayPhotoFragment)
                .commit()
    }
}