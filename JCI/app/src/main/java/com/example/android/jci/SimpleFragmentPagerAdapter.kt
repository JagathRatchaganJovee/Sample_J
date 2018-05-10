package com.example.android.jci

import android.content.Context
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class SimpleFragmentPagerAdapter(fm: FragmentManager, private val context: Context) : FragmentPagerAdapter(fm) {
    private val tabTitles = arrayOf("Home", "Foundation")


    override fun getItem(position: Int): Fragment {
        return if (position == 0) {
            HomeFragment()
        } else{
            FoundationFragment()
        }
        /*else if (position == 1) {
            FoundationFragment()
        } else {
            thirdFragment()
        }*/
    }


    override fun getCount(): Int {
        return 2
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return tabTitles[position]
    }
}
