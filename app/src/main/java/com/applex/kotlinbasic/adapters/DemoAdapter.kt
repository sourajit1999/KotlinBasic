package com.applex.kotlinbasic.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.applex.kotlinbasic.R
import com.applex.kotlinbasic.models.DemoModel
import kotlinx.android.synthetic.main.item_recycler.view.*

class DemoAdapter(private val demoList: ArrayList<DemoModel>) : RecyclerView.Adapter<DemoAdapter.ProgrammingViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProgrammingViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_recycler, parent, false)
        return ProgrammingViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ProgrammingViewHolder, position: Int) {
        val currentItem = demoList[position]
        holder.textView.text = currentItem.text
        holder.imageView.setImageResource(currentItem.imageRes)
    }

//    override fun getItemCount(): Int {
//
//    }

    //single exp syntax
    override fun getItemCount() = demoList.size

    class ProgrammingViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.imageView
        val textView: TextView = itemView.textView
    }

}