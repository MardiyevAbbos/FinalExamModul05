package com.example.finalexammodul05.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.finalexammodul05.R
import com.example.finalexammodul05.model.Collections
import com.google.android.material.imageview.ShapeableImageView
import com.squareup.picasso.Picasso

class CollectionsAdapter(var context: Context, var items: ArrayList<Collections>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return CollectionsViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_collections_view, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is CollectionsViewHolder){
            holder.bind(items[position])
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class CollectionsViewHolder(var view: View) : RecyclerView.ViewHolder(view) {
        fun bind(item: Collections) {
            val image: ShapeableImageView = view.findViewById(R.id.iv_photo)
            val title: TextView = view.findViewById(R.id.tv_title)

            //Glide.with(context).load(item.image).into(image)
            //Picasso.get().load(item.image).into(image)
            image.setImageResource(R.drawable.image)
            title.text = item.title
        }
    }

}