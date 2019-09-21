package com.example.kotlinassigment.network.response

import com.example.kotlinassigment.data.vos.MovieVO
import com.example.kotlinassigment.utilits.MovieConstants.CODE_RESPONSE_OK
import com.google.gson.annotations.SerializedName

data class GetMovieResponse(

    @SerializedName("code")
    val code: Int,

    @SerializedName("message")
    val message: String,

    @SerializedName("data")
    val data: List<MovieVO>?
) {
    fun isResponseOK(): Boolean {
        return code == CODE_RESPONSE_OK && data != null
    }
}