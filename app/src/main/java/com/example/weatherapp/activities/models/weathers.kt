package com.example.weatherapp.activities.models

import android.accounts.AuthenticatorDescription

data class weathers (
    val message : String,
    val cod : String,
    val count : Int,
    val list : ArrayList<Weather>
)

data class  Weather(
    val id : Int,
    val name : String,
    val cood : Coord,
    val main : MainWeather,
    val dt : Int,
    val wind : WindWeather,
    val clouds : CloudWeather,
    val weather : ArrayList<ResumeWeather>
)

data class Coord (
    val lat : Double,
    val lon : Double
    )

data class MainWeather(
    val temp : Double,
    val fels_like : Double,
    val temps_min: Double,
    val temp_max : Double,
    val pressure : Int,
    val humidity : Int
)

data class CloudWeather(
    val all : Int
)

data class  WindWeather(
    val speed : Double,
    val deg : Int
)
data class ResumeWeather (
    val id : Int,
    val main : String,
    val description: String,
    val icon : String
    )