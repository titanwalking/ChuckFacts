package com.colossussoftware.chuckfacts.data.repository

import com.colossussoftware.chuckfacts.data.remote.ApiService
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers
import javax.inject.Inject

//
// Created by alican.korkmaz on 17.02.2021.
//
class MainRepository @Inject constructor(private val apiService: ApiService) {
    fun getRandomJoke() = apiService.getRandomJoke().subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
}