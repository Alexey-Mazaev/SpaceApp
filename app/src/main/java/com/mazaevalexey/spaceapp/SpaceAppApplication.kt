package com.mazaevalexey.spaceapp

import android.app.Application

class SpaceAppApplication : Application() {
    val applicationComponent = DaggerApplicationComponent.create()
}