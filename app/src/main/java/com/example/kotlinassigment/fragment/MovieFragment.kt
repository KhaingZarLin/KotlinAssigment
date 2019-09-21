package com.example.kotlinassigment.fragment

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlinassigment.MovieDetialActivity

import com.example.kotlinassigment.R
import com.example.kotlinassigment.adapter.MovieAdapter
import com.example.kotlinassigment.data.models.MovieModel
import com.example.kotlinassigment.data.models.MovieModelImpl
import com.example.kotlinassigment.data.vos.MovieVO
import com.example.kotlinassigment.delegate.FragmentDelegateOne
import kotlinx.android.synthetic.main.fragment_movie.*


class MovieFragment : Fragment(),FragmentDelegateOne {

    private val fragmentDelegateOne: FragmentDelegateOne? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_movie, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val linearLayoutManager: LinearLayoutManager

        linearLayoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        recyclerview.setLayoutManager(linearLayoutManager)

        val movieAdapter = MovieAdapter(this)
        recyclerview.setAdapter(movieAdapter)

        MovieModelImpl.getAllMovies(
            onSuccess = {moviesVO ->
                movieAdapter.setNewData(moviesVO as MutableList<MovieVO>)
                recyclerview.adapter = movieAdapter
            },
            onFailure = {

            }
        )
    }

    override fun onClicked(id: Int) {

    }


}
