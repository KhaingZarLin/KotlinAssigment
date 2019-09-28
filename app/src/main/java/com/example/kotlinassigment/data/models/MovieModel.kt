package com.example.kotlinassigment.data.models

import com.example.kotlinassigment.data.vos.MovieVO

interface MovieModel {

    fun getAllMovies(onSuccess: (List<MovieVO>) -> Unit, onFailure: (String) -> Unit)
    fun getMovieById(movietId:Int):MovieVO
}