package com.example.finalexammodul05.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.finalexammodul05.R
import com.example.finalexammodul05.model.Restaurant

class RestaurantAdapter(var context: Context ,var items: ArrayList<Restaurant>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_restaurant_view, parent, false)
        return RestaurantViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is RestaurantViewHolder){
            holder.bind(items[position])
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class RestaurantViewHolder(var view: View) : RecyclerView.ViewHolder(view){
        fun bind(item: Restaurant){
            val image: ImageView = view.findViewById(R.id.iv_photo)
            val title: TextView = view.findViewById(R.id.tv_title)
            val info: TextView = view.findViewById(R.id.tv_info)

            //Glide.with(context).load(item.image).into(image)
            image.setImageResource(R.drawable.image)
            title.text = item.title
            info.text = item.info
        }
    }

}