package com.mazaevalexey.spaceapp.ui.astronomydaypicture

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.mazaevalexey.spaceapp.api.data.AstronomyDayPicture
import com.mazaevalexey.spaceapp.repositories.AstronomyDayPictureRepository
import javax.inject.Inject

class AstronomyDayPictureViewModel @Inject constructor(
    private val dayPictureRepository: AstronomyDayPictureRepository
): ViewModel() {

    val dayPicture: LiveData<AstronomyDayPicture> = liveData {
        val astronomyDayPicture = dayPictureRepository.getAstronomyDayPicture()
        emit(astronomyDayPicture)
    }
}