package com.example.androidtravalapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var recyclerVw: RecyclerView = findViewById(R.id.top_place_rv)
        var recyclerVw1: RecyclerView = findViewById(R.id.places_rv)
        recyclerVw.layoutManager = LinearLayoutManager(this)
        recyclerVw1.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true)
        var arrList: ArrayList<Places> = arrayListOf(Places("Ranu Kumbolo", "Lumajang Jawa timur", 4, "https://vcdn-english.vnecdn.net/2019/04/28/shutterstock327874280-15564535-8300-2849-1556453606_r_680x408.png"), Places("MOunt Bromo", "Jawa timur", 5, "https://vcdn-english.vnecdn.net/2019/04/28/shutterstock327874280-15564535-8300-2849-1556453606_r_680x408.png"))

        var adapter = TopPlaceAdapter(arrList)
        var adapter1 = TravelAdapter(arrList)
        recyclerVw.adapter = adapter
        recyclerVw1.adapter = adapter1
    }
}