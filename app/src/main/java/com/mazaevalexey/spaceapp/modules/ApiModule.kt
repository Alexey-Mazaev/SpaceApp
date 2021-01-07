package com.mazaevalexey.spaceapp.modules

import com.mazaevalexey.spaceapp.api.AstronomyDayPictureApi
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
class ApiModule {

    @Singleton
    @Provides
    fun provideAstronomyDayPictureApi(): AstronomyDayPictureApi = Retrofit.Builder()
        .baseUrl("https://api.nasa.gov/")
        .addConverterFactory(MoshiConverterFactory.create())
        .build()
        .create(AstronomyDayPictureApi::class.java)
}