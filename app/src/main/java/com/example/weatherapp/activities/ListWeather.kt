package com.example.weatherapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.weatherapp.R
import com.example.weatherapp.activities.models.Weather
import com.example.weatherapp.activities.models.weathers

class ListWeather :AppCompatActivity(){
    companion object{
        var Weather = arrayListOf<Weather>()
    }

    val adapter = WeatherAdapter(Weather, this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.weather_item)
        val recyclerView = findViewById<RecyclerView>(R.id.weatherItemList)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
        println("Activity 1: onCreate")
    }

}