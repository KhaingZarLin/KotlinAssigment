package com.example.kotlinassigment.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.kotlinassigment.fragment.MovieFragment
import java.lang.reflect.Array.get

class TabPagerAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {
    override fun getCount(): Int {
        return 3
    }

    override fun getItem(i: Int): Fragment {
        return if (i == 0) {
            MovieFragment()
        } else if (i == 1) {
            MovieFragment()
        } else {
            MovieFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence {
        return if (position == 0) {
            "Now Showing"
        } else if (position == 1) {
            "Cinema"
        } else {
            "Comming Soon"
        }
    }
}
