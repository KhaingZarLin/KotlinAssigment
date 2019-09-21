package com.example.kotlinassigment.data.vos

import androidx.room.ColumnInfo
import androidx.room.Entity
import com.google.gson.annotations.SerializedName

@Entity(tableName = "genre")
data class GenreVO (

    @SerializedName("id")
    @ColumnInfo(name = "id")
    private val id: Int,

    @SerializedName("name")
    @ColumnInfo(name = "name")
    private val name: String
)