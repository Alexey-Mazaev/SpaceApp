package com.mazaevalexey.spaceapp.repositories

import com.mazaevalexey.spaceapp.api.AstronomyDayPictureApi
import com.mazaevalexey.spaceapp.api.data.AstronomyDayPicture
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AstronomyDayPictureRepository @Inject constructor(
    private val astronomyDayPictureApi: AstronomyDayPictureApi
) {

    suspend fun getAstronomyDayPicture(): AstronomyDayPicture =
        astronomyDayPictureApi.getDayPicture()
}