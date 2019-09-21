package com.example.kotlinassigment.data.vos

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName


@Entity(tableName = "movie_db")
data class MovieVO (

    @PrimaryKey
    @SerializedName("id")
    @ColumnInfo(name = "id")
    val id: Int,

    @SerializedName("movie_name")
    @ColumnInfo(name = "movie_name")
    val movie_name: String,

    @SerializedName("imdb")
    @ColumnInfo(name = "imdb")
    val imdb: Double,

    @SerializedName("rotten_tomato")
    @ColumnInfo(name = "rotten_tomato")
    val rotten_tomato: Int,

    @SerializedName("meta_centric")
    @ColumnInfo(name = "meta_centric")
    val meta_centric: Int,

    @SerializedName("genre")
    val genre: List<GenreVO>,

    @SerializedName("overview")
    @ColumnInfo(name = "overview")
    val overview: String,

    @SerializedName("poster")
    @ColumnInfo(name = "poster")
    val poster: String

)