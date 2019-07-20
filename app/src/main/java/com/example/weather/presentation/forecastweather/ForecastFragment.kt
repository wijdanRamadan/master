package com.example.weather.presentation.forecastweather

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.weather.R

class ForecastFragment : Fragment() {

    private val testList = listOf(
        ForecastWeatherInfo("1", "test 1 ", 1),
        ForecastWeatherInfo("1", "test 1 ", 1),
        ForecastWeatherInfo("1", "test 1 ", 1),
        ForecastWeatherInfo("1", "test 1 ", 1)
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        retainInstance = true

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?, savedInstanceState: Bundle?
    )
            : View? {
        return inflater!!.inflate(R.layout.forecast_fragment, container, false)

    }
   override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // RecyclerView node initialized here

        }

    }

