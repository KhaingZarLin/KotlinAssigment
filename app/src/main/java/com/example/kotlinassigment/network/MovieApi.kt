package com.example.kotlinassigment.network

import com.example.kotlinassigment.network.response.GetMovieResponse
import com.example.kotlinassigment.utilits.MovieConstants.GET_Movie
import retrofit2.Call
import retrofit2.http.POST

interface MovieApi {

    @POST(GET_Movie)
    fun getAllMovies(): Call<GetMovieResponse>
}