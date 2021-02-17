package com.colossussoftware.chuckfacts.data.remote

import com.colossussoftware.chuckfacts.data.remote.RandomJoke
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET

//
// Created by alican.korkmaz on 17.02.2021.
//
interface ApiService {
    @GET("/jokes/random")
    fun getRandomJoke(): Single<RandomJoke>
}