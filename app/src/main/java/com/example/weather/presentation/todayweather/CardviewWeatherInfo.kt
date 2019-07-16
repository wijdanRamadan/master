package com.example.weather.presentation.todayweather

import android.content.Context
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class CardviewWeatherInfo: LinearLayout{

    lateinit var text: TextView
    lateinit var image: ImageView

    constructor(context: Context) : super(context){
    }

    fun setText(text: String) {
        this.text.text = text
    }

}