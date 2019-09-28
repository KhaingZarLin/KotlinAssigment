package com.example.kotlinassigment.network.dataagent

import com.example.kotlinassigment.data.vos.MovieVO

interface MovieDataAgent {
    fun getAllMovies(accessToken : String,onSuccess: (List<MovieVO>) -> Unit, onFailure: (String) -> Unit)
}