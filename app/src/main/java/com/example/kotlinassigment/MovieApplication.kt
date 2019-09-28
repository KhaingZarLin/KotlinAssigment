package com.example.kotlinassigment

import android.app.Application
import com.example.kotlinassigment.data.models.MovieModelImpl

class MovieApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        MovieModelImpl.initDatabase(applicationContext)
    }
}