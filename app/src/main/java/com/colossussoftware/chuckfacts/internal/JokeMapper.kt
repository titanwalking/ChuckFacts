package com.colossussoftware.chuckfacts.internal

import com.colossussoftware.chuckfacts.data.remote.RandomJoke
import com.colossussoftware.chuckfacts.ui.model.Joke

//
// Created by alican.korkmaz on 17.02.2021.
//
class JokeMapper : Mapper<RandomJoke, Joke> {
    override fun map(input: RandomJoke): Joke {
        return Joke(input.iconURL, input.value)
    }
}