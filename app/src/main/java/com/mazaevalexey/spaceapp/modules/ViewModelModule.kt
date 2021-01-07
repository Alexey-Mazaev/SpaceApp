package com.mazaevalexey.spaceapp.modules

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mazaevalexey.spaceapp.ui.astronomydaypicture.AstronomyDayPictureViewModel
import com.mazaevalexey.spaceapp.utils.ViewModelFactory
import com.mazaevalexey.spaceapp.utils.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap


@Module
abstract class ViewModelModule {

    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(AstronomyDayPictureViewModel::class)
    abstract fun provideAstronomyDayPictureViewModel(viewModel: AstronomyDayPictureViewModel): ViewModel
}