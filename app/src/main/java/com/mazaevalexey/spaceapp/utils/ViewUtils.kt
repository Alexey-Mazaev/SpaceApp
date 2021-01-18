package com.mazaevalexey.spaceapp.utils

import android.widget.ImageView
import com.squareup.picasso.Picasso

fun ImageView.loadAssetByUrl(url: String?) = Picasso.get()
    .load(url)
    .into(this)
