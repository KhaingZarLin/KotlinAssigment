package com.example.kotlinassigment.network

import com.example.kotlinassigment.network.response.GetMovieResponse
import com.example.kotlinassigment.utilits.MovieConstants.GET_Movie
import com.example.kotlinassigment.utilits.MovieConstants.PARAM_ACCESS_TOKEN
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface MovieApi {

    @POST(GET_Movie)
    @FormUrlEncoded
    fun getAllMovies(@Field(PARAM_ACCESS_TOKEN)accessToken : String) : Call<GetMovieResponse>
}