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
import com.example.finalexammodul05.model.Messages
import com.google.android.material.imageview.ShapeableImageView
import com.squareup.picasso.Picasso

class MessagesAdapter(var context: Context, var items: ArrayList<Messages>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return MessagesViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_messages_view, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MessagesViewHolder) {
            holder.bind(items[position])
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class MessagesViewHolder(var view: View) : RecyclerView.ViewHolder(view) {
        fun bind(item: Messages) {
            val profile: ShapeableImageView = view.findViewById(R.id.iv_profile)
            val fullName: TextView = view.findViewById(R.id.tv_fullName)
            val message: TextView = view.findViewById(R.id.tv_message)

            //Glide.with(view).load(item.profile).error(R.drawable.ic_launcher_background).into(profile)
            //Picasso.get().load("").into(profile)
            profile.setImageResource(R.drawable.image)
            fullName.text = item.fullName
            message.text = item.message
        }
    }

}