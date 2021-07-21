package com.example.weatherapp.activities.services


import android.content.Context
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.weatherapp.activities.models.Weather
import com.example.weatherapp.activities.models.weathers
import com.google.gson.Gson

class WeatherHTTPClient {
    val baseUrl = "https://community-open-weather-map.p.rapidapi.com/find"

    constructor(context : Context){
        val queue : RequestQueue = Volley.newRequestQueue(context)
    }

    fun findWeatherFromCity(cityName: String, onSuccess:OnSuccessWeather,
                            onError: Response.ErrorListener=Response.ErrorListener { error(onSuccess)}){
        val url = "${baseUrl}?=${cityName}"
        val request = StringRequest(
            Request.Method.GET, url,
            { response -> onSuccess.onSuccess(Gson().fromJson(response,Weather::class.java))},    //onSuccess
            { error -> /*onError.onError(Gson().fromJson(onError))*/}        //onError
        )

        request.headers["x-rapidapi-key"] = "774d1a930fmshd20347120295743p1fa0b9jsndb0ef368977a"
        request.headers["x-rapidapi-host"] = "community-open-weather-map.p.rapidapi.com"
    }
}

typealias OnSuccessWeather = (weathers) -> Unit