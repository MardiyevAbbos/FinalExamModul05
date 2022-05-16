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
import com.example.finalexammodul05.model.Collections
import com.example.finalexammodul05.model.Messages
import com.example.finalexammodul05.model.SearchModel
import com.google.android.material.imageview.ShapeableImageView

class SearchAdapter(var context: Context, var items: ArrayList<SearchModel>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return SearchViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_search_view, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is SearchViewHolder) {
            holder.bind(items[position])
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class SearchViewHolder(var view: View) : RecyclerView.ViewHolder(view) {
        fun bind(item: SearchModel) {
            val image: ImageView = view.findViewById(R.id.iv_image)
            val title: TextView = view.findViewById(R.id.tv_title)
            val price: TextView = view.findViewById(R.id.tv_price)

            //Glide.with(context).load(item.image).into(image)
            image.setImageResource(R.drawable.image)
            title.text = item.title
            price.text = item.price
        }
    }

}