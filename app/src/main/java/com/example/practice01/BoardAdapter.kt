package com.example.practice01

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BoardAdapter(private val itemList: ArrayList<BoardItem>) : RecyclerView.Adapter<BoardAdapter.BoardViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BoardViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recycler_view, parent, false)
        return BoardViewHolder(view)
    }

    override fun getItemCount(): Int {
        return itemList.count()
    }

    override fun onBindViewHolder(holder: BoardViewHolder, position: Int) {
        holder.tv_time.text = itemList[position].time
        holder.tv_title.text = itemList[position].title
        holder.tv_name.text = itemList[position].name
    }

    inner class BoardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val tv_time = itemView.findViewById<TextView>(R.id.tv_time)
        val tv_title = itemView.findViewById<TextView>(R.id.tv_title)
        val tv_name = itemView.findViewById<TextView>(R.id.tv_name)
    }
}