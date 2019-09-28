package com.example.kotlinassigment.data.models

import com.example.kotlinassigment.data.vos.MovieVO
import com.example.kotlinassigment.utilits.MovieConstants.DUAMY_ACCESS_TOKEN

object MovieModelImpl: BaseModel(), MovieModel {
    override fun getMovieById(movietId: Int): MovieVO {
        val movieVo =database.movieDao().getMoviesById(movietId)
        return movieVo
    }


    override fun getAllMovies(onSuccess: (List<MovieVO>) -> Unit, onFailure: (String) -> Unit) {

        val movieDataFromDB = database.movieDao().getMovies()
        if (movieDataFromDB.isNotEmpty()) {
            onSuccess(movieDataFromDB)
        }else {
            dataAgent.getAllMovies(DUAMY_ACCESS_TOKEN,
                onSuccess={
                   database.movieDao().insertMovies(it)
                    onSuccess(it)
                },
                onFailure= {

                })
        }
    }
}