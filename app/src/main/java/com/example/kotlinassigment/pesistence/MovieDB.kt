package com.example.kotlinassigment.pesistence

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.kotlinassigment.data.vos.MovieVO
import com.example.kotlinassigment.pesistence.daos.MovieDao
import com.example.kotlinassigment.pesistence.typeConventer.GenreTypeConverter
import com.example.kotlinassigment.utilits.MovieConstants.DB_NAME

@Database(entities = arrayOf(MovieVO::class), version = 4, exportSchema = false)
@TypeConverters(GenreTypeConverter::class)
abstract class MovieDB: RoomDatabase() {

    abstract fun movieDao(): MovieDao

    companion object{
        private var instance : MovieDB?= null

        fun getInstance(context: Context): MovieDB{
            if (instance == null){
                instance = Room.databaseBuilder(context, MovieDB::class.java, DB_NAME)
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build()
            }
            return instance!!
        }
    }

    fun areDatasExitInDB(): Boolean{
        return movieDao().getMovies().isNotEmpty()
    }
}