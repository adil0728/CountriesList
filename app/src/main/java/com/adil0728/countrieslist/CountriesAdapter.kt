package com.adil0728.countrieslist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.Collections

class CountriesAdapter(private val arrayList: ArrayList<Country>) :
    RecyclerView.Adapter<CountriesAdapter.MyViewHolder>(), ItemTouchHelperAdapter {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val flag: ImageView = this.itemView.findViewById(R.id.flag)
        val name: TextView = this.itemView.findViewById(R.id.name)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val views =
            LayoutInflater.from(parent.context).inflate(R.layout.country_item, parent, false)
        return MyViewHolder(views)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.flag.setImageResource(arrayList[position].flag)
        holder.name.text = arrayList[position].name
        holder.itemView.setOnClickListener {

        }
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onItemMove(fromPosition: Int, toPosition: Int) {
        if (fromPosition < toPosition) {
            for (i in fromPosition until toPosition) {
                Collections.swap(arrayList, i, i + 1)
            }
        } else {
            for (i in fromPosition downTo toPosition + 1){
                Collections.swap(arrayList, i, i - 1)
            }
        }
        notifyItemMoved(fromPosition, toPosition)
    }
}