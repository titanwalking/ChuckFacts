package com.colossussoftware.chuckfacts.utils

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import coil.load

//
// Created by alican.korkmaz on 17.02.2021.
//
object BindingAdapters {

    @BindingAdapter("imageUrl")
    @JvmStatic
    fun loadImage(view: ImageView, url: String?) {
        url?.let{ view.load(it) }
    }
}