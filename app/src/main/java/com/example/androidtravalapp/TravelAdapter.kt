package com.example.androidtravalapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.net.toUri
import androidx.recyclerview.widget.RecyclerView

class TravelAdapter(var travelArr: ArrayList<Places>): RecyclerView.Adapter<TravelViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TravelViewHolder {
        var holder = LayoutInflater.from(parent.context).inflate(R.layout.travel_cardview_hor_layout, parent, false)
        return TravelViewHolder(holder)
    }

    override fun onBindViewHolder(holder: TravelViewHolder, position: Int) {
        var vm = travelArr[position]
        holder.image.setImageResource(R.drawable.img3)
        holder.rating.text = vm.rating.toString()
        holder.location.text = vm.location
        holder.nameOfPlace.text = vm.nameOfPlace
    }

    override fun getItemCount(): Int {
        return travelArr.size
    }
}

class TravelViewHolder(view: View): RecyclerView.ViewHolder(view) {
    var nameOfPlace: TextView = view.findViewById(R.id.travel_name)
    var location: TextView = view.findViewById(R.id.travel_desc)
    var rating: TextView = view.findViewById(R.id.travel_rating)
    var image: ImageView = view.findViewById(R.id.travel_image)
}