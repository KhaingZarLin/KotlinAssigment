package com.example.kotlinassigment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlinassigment.data.models.MovieModel
import com.example.kotlinassigment.data.models.MovieModelImpl

abstract class BaseActivity: AppCompatActivity() {
    protected lateinit var model: MovieModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        model = MovieModelImpl
    }
}