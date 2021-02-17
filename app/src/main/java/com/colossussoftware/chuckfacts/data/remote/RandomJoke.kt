package com.colossussoftware.chuckfacts.data.remote

import com.squareup.moshi.Json

//
// Created by alican.korkmaz on 17.02.2021.
//
data class RandomJoke(
    @Json(name = "icon_url")
    val iconURL: String,

    val id: String,
    val url: String,
    val value: String
)
