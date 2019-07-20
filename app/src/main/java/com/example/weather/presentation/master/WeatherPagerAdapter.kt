package com.example.weather.presentation.master

import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.weather.presentation.forecastweather.ForecastFragment
import com.example.weather.presentation.todayweather.TodayFragment

class WeatherPagerAdapter(fm: FragmentManager,
                          private var totalTabs: Int) :
    FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): androidx.fragment.app.Fragment {
        return if (position == 0) {
            TodayFragment()
        } else
            ForecastFragment()
    }

    override fun getCount(): Int {
        return totalTabs
    }
}