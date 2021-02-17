package com.colossussoftware.chuckfacts.ui.main

import android.util.Log
import androidx.lifecycle.*
import com.colossussoftware.chuckfacts.data.repository.MainRepository
import com.colossussoftware.chuckfacts.internal.JokeMapper
import com.colossussoftware.chuckfacts.ui.model.Joke
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

//
// Created by alican.korkmaz on 17.02.2021.
//
@HiltViewModel
class MainViewModel @Inject constructor(private val mainRepository: MainRepository) : ViewModel() {

    private val jokeMapper = JokeMapper()

    private val _joke = MutableLiveData<Joke>()
    val joke: LiveData<Joke> = _joke

    init {
        getRemoteRandomJoke()
    }

    fun getRemoteRandomJoke() {
        mainRepository.getRandomJoke().subscribe(
            { randomJoke -> _joke.postValue(jokeMapper.map(randomJoke)) },
            { t -> t?.let { Log.e("MainViewModel", "getRemoteRandomJoke: ${it.message}") } }
        )
    }
}