package com.example.weather.presentation.forecastweather

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.weather.R

class WeatherViewHolder(inflater: LayoutInflater, parent: ViewGroup) : RecyclerView.ViewHolder(
    inflater.inflate(
        R.layout.forecast_list_item, parent, false
    )
) {

    private var forecastWeatherDescription: TextView? = null
    private var forecastWeatherTemperature: TextView? = null
    private var forecastWeatherIcon: ImageView? = null

    init {
        forecastWeatherDescription = itemView.findViewById(R.id.weather_description)
        forecastWeatherTemperature = itemView.findViewById(R.id.temperature_degree)
        forecastWeatherIcon = itemView.findViewById(R.id.forecast_circle_icon)
    }

    fun bind(data: ForecastWeatherInfo) {
        forecastWeatherDescription?.text = data.weatherDescription
        forecastWeatherTemperature?.text = data.temperature
    }
}