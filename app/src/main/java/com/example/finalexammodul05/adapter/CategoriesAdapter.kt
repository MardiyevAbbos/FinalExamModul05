package com.example.finalexammodul05.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.finalexammodul05.R
import com.example.finalexammodul05.model.Categories
import com.google.android.material.imageview.ShapeableImageView

class CategoriesAdapter(var items: ArrayList<Categories>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_categories, parent, false)
        return CategoriesViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is CategoriesViewHolder){
            holder.bind(items[position])
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class CategoriesViewHolder(var view: View) : RecyclerView.ViewHolder(view){
        fun bind(item: Categories){
            val image: ShapeableImageView = view.findViewById(R.id.iv_photo)
            val title: TextView = view.findViewById(R.id.tv_title)

            image.setImageResource(item.image)
            title.text = item.title
        }
    }

}