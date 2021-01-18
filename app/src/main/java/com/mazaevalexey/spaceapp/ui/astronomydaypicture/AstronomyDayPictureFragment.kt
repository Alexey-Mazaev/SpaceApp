package com.mazaevalexey.spaceapp.ui.astronomydaypicture

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.mazaevalexey.spaceapp.R
import com.mazaevalexey.spaceapp.SpaceAppApplication
import com.mazaevalexey.spaceapp.ui.BaseFragment
import com.mazaevalexey.spaceapp.utils.loadAssetByUrl
import javax.inject.Inject

class AstronomyDayPictureFragment : BaseFragment(R.layout.astronomy_day_picture_fragment) {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private lateinit var photoView: ImageView
    private lateinit var photoTitleView: TextView
    private lateinit var viewModel: AstronomyDayPictureViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        (activity?.applicationContext as SpaceAppApplication).applicationComponent.inject(this)

        viewModel =
            ViewModelProvider(this, viewModelFactory)[AstronomyDayPictureViewModel::class.java]

        viewModel.dayPicture.observe(this, { astronomyDayPicture ->
            photoTitleView.text = astronomyDayPicture?.title
            photoView.loadAssetByUrl(astronomyDayPicture.url)
        })
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        photoView = view.findViewById(R.id.photo)
        photoTitleView = view.findViewById(R.id.photo_title)
    }
}