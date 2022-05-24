package com.example.androidtravalapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.net.toUri
import androidx.recyclerview.widget.RecyclerView

class TopPlaceAdapter(var places: ArrayList<Places>): RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val holder = LayoutInflater.from(parent.context).inflate(R.layout.top_places_layout, parent, false)
        return ViewHolder(holder)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var vm = places[position]
        holder.nameOfPlace.text = vm.nameOfPlace
        holder.location.text = vm.location
        holder.rating.text = vm.rating.toString()
        holder.image.setImageResource(R.drawable.img2)
    }

    override fun getItemCount(): Int {
        return places.size
    }

}

class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
    var nameOfPlace: TextView = view.findViewById(R.id.top_place_name)
    var location: TextView = view.findViewById(R.id.top_place_loc)
    var rating: TextView = view.findViewById(R.id.top_place_rating)
    var image: ImageView = view.findViewById(R.id.top_place_img)
}