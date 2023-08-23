package com.enzo.evaluacionfatality.dogs

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.enzo.evaluacionfatality.R


class DogAdapte (private val images:List<String>):RecyclerView.Adapter<DogVH>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogVH {
        val layoutInflater = LayoutInflater.from(parent.context)
        return DogVH(layoutInflater.inflate(R.layout.item_dog,parent,false))
    }

    override fun getItemCount(): Int = images.size

    override fun onBindViewHolder(holder: DogVH, position: Int) {
        val item = images[position]
        holder.bind(item)
    }
}