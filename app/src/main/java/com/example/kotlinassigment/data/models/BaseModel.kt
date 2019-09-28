package com.example.kotlinassigment.data.models

import android.content.Context
import com.example.kotlinassigment.network.dataagent.MovieDataAgent
import com.example.kotlinassigment.network.dataagent.RetrofitDataAgentImpl
import com.example.kotlinassigment.pesistence.MovieDB

abstract class BaseModel {
    protected val dataAgent: MovieDataAgent=RetrofitDataAgentImpl


    protected lateinit var database: MovieDB

    fun initDatabase(context: Context){
        database = MovieDB.getInstance(context)
    }

}
