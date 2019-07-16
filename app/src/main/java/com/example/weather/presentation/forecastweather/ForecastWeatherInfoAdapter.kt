package com.example.weather.presentation.forecastweather

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ForecastWeatherInfoAdapter(private val list: List<ForecastWeatherInfo>) :
    RecyclerView.Adapter<WeatherViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeatherViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return WeatherViewHolder(inflater, parent)
    }


    override fun onBindViewHolder(holder: WeatherViewHolder, position: Int) {

        val info: ForecastWeatherInfo= list[position]
        holder.bind(info)   }

    override fun getItemCount(): Int = list.size
}