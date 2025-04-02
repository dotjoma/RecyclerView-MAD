package com.example.rviewbaste

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val itemList: MutableList<MyItem>) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
        inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),
                View.OnClickListener, View.OnLongClickListener {
                    val textViewItem: TextView = itemView.findViewById(R.id.tvItem)

            override fun onClick(p0: View?) {
                TODO("Not yet implemented")
            }

            override fun onLongClick(p0: View?): Boolean {
                TODO("Not yet implemented")
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = itemList[position]
        holder.textViewItem.text = currentItem.text
    }

    override fun getItemCount(): Int {
        return itemList.size
    }
}