package com.example.weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.weatherapp.activities.models.weathers
import com.example.weatherapp.activities.services.WeatherHTTPClient

class WeatherActivity : AppCompatActivity() {
    val weatherhtppclient = WeatherHTTPClient(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val onSuccess = object : onSuccessWeather {
           // override fun onSucess(){

          //  }
         //   }
            weatherhtppclient.findWeatherFromCity(cityName= "Paris", this::onResponse)
        }

    fun onResponse(weathers: weathers) {
        println(weathers)
    }

    fun afficherWeather(){
        println(arrayListOf(weatherhtppclient))
    }
    }
