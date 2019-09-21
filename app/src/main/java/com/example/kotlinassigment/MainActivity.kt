package com.example.kotlinassigment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.viewpager.widget.ViewPager
import com.example.kotlinassigment.adapter.TabPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val tabPagerAdapter = TabPagerAdapter(supportFragmentManager)
        vp.setAdapter(tabPagerAdapter)
        tablayout.setupWithViewPager(vp)


    }
}

private fun View.setupWithViewPager(viewPager: ViewPager?) {

}

private fun Int.setupWithViewPager(viewPager: Int) {

}

private fun Int.setAdapter(tabPagerAdapter: TabPagerAdapter) {

}
