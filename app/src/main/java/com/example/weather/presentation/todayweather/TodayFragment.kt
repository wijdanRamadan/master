package com.example.weather.presentation.todayweather

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.example.weather.R

class TodayFragment : Fragment() {

    lateinit var info :CardviewWeatherInfo
    lateinit var prague :ImageView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.today_fragment, container , false)
    }
}