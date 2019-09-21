package com.example.kotlinassigment.pesistence.daos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.kotlinassigment.data.vos.MovieVO

@Dao
abstract class MovieDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract fun insertMovies(movies: List<MovieVO>): LongArray

    @Query("select * from movie_db")
    abstract fun getMovies(): List<MovieVO>

    @Query("SELECT * FROM movie_db WHERE id= :id")
    abstract fun getMoviesById(id: Int): MovieVO
}