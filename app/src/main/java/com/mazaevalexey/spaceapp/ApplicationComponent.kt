package com.mazaevalexey.spaceapp

import com.mazaevalexey.spaceapp.modules.ApiModule
import com.mazaevalexey.spaceapp.modules.ViewModelModule
import com.mazaevalexey.spaceapp.ui.astronomydaypicture.AstronomyDayPictureFragment
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [
    ApiModule::class,
    ViewModelModule::class
])
interface ApplicationComponent {
    fun inject(fragment: AstronomyDayPictureFragment)
}