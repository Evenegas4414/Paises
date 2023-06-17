package com.ervr.paises

import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var tv1: TextView
    private lateinit var list1: ListView

    private val countries = arrayListOf(
        "Argentina",
        "Bolivia",
        "Brasil",
        "Chile",
        "Colombia",
        "Ecuador",
        "Guyana",
        "Paraguay",
        "Perú",
        "Surinam",
        "Uruguay",
        "Venezuela"
    )

    private val populations = mapOf(
        "Argentina" to 45376763,
        "Bolivia" to 11673021,
        "Brasil" to 213993437,
        "Chile" to 18952038,
        "Colombia" to 50372424,
        "Ecuador" to 17373662,
        "Guyana" to 785349,
        "Paraguay" to 7152703,
        "Perú" to 32824358,
        "Surinam" to 568301,
        "Uruguay" to 3482156,
        "Venezuela" to 32381221
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv1 = findViewById(R.id.tv1)
        list1 = findViewById(R.id.list1)

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, countries)
        list1.adapter = adapter

        list1.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            val selectedCountry = countries[position]
            val population = populations[selectedCountry]
            tv1.text = "Población de $selectedCountry: $population"
        }
    }
}
