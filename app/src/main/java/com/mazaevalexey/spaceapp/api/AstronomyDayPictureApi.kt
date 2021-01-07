package com.mazaevalexey.spaceapp.api

import com.mazaevalexey.spaceapp.api.data.AstronomyDayPicture
import retrofit2.http.GET
import retrofit2.http.Query

interface AstronomyDayPictureApi {
    @GET("planetary/apod")
    suspend fun getDayPicture(@Query("api_key") apKey: String = "DEMO_KEY"): AstronomyDayPicture
}