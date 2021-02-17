package com.colossussoftware.chuckfacts.internal

//
// Created by alican.korkmaz on 17.02.2021.
//
interface Mapper<I, O> {
    fun map(input: I): O
}