package com.example.virtualtravel.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.virtualtravel.data.Explore
import com.example.virtualtravel.databinding.RowItemExploreBinding

class ExploreAdapter(private val listExplore: ArrayList<Explore>) :
    RecyclerView.Adapter<ExploreAdapter.MyExploreHolder>() {
    inner class MyExploreHolder(val binding: RowItemExploreBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyExploreHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: MyExploreHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}