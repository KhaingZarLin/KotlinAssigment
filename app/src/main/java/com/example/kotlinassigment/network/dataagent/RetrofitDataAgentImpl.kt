package com.example.kotlinassigment.network.dataagent

import com.example.kotlinassigment.data.vos.MovieVO
import com.example.kotlinassigment.network.MovieApi
import com.example.kotlinassigment.network.response.GetMovieResponse
import com.example.kotlinassigment.utilits.MovieConstants.BASE_URL
import com.example.kotlinassigment.utilits.MovieConstants.EM_NULL_EVENT_RESONSE
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object RetrofitDataAgentImpl:MovieDataAgent {

    private val movieApi:MovieApi
    init {
        val okHttpClient=OkHttpClient.Builder()
            .connectTimeout(15,TimeUnit.SECONDS)
            .readTimeout(60,TimeUnit.SECONDS)
            .writeTimeout(60,TimeUnit.SECONDS)
            .build()
        val retrofit=Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        movieApi=retrofit.create(MovieApi::class.java)

    }
    override fun getAllMovies(onSuccess: (List<MovieVO>) -> Unit, onFailure: (String) -> Unit) {
        movieApi.getAllMovies().enqueue(object: Callback<GetMovieResponse>{
            override fun onFailure(call: Call<GetMovieResponse>, t: Throwable) {
                onFailure(t.localizedMessage)
            }

            override fun onResponse(call: Call<GetMovieResponse>, response: Response<GetMovieResponse>) {
                val response = response.body()
                if (response != null) {
                    if (response.data != null) {
                        onSuccess(response.data)
                    } else {
                        onFailure(response.message)
                    }
                }else{
                    onFailure(EM_NULL_EVENT_RESONSE)
                }
            }

        })
    }
}