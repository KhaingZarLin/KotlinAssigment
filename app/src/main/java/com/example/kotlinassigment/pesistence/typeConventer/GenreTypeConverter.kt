package com.example.kotlinassigment.pesistence.typeConventer

import androidx.room.TypeConverter
import com.example.kotlinassigment.data.vos.GenreVO
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class GenreTypeConverter {

    @TypeConverter
    fun toString(list: List<GenreVO>): String{
        return Gson().toJson(list)
    }

    @TypeConverter
    fun toList(json: String): List<GenreVO>{
        val typeToken = object: TypeToken<List<GenreVO>>(){}.type
        return Gson().fromJson(json, typeToken)
    }

}