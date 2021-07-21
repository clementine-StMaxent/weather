package com.example.weatherapp.activities

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.weatherapp.R

class WeatherAdapter (val dataSet: ArrayList<Weather>, val context: Context):
    RecyclerView.Adapter<WeatherAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textNom: TextView
        val textPrenom: TextView
        val deleteButton: ImageView
        val editButton: ImageView

        init {
            textNom = view.findViewById(R.id.text_nom)
            textPrenom = view.findViewById(R.id.text_prenom)
            deleteButton = view.findViewById(R.id.delete_button)
            editButton = view.findViewById(R.id.edit_button)
        }
    }
}