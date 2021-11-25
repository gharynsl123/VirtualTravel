package com.example.virtualtravel.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.virtualtravel.data.Home
import com.example.virtualtravel.databinding.RowItemHomeBinding


class HomeAdapeter(private val listHome: ArrayList<Home>) :
    RecyclerView.Adapter<HomeAdapeter.MyHomeHolder>() {
    inner class MyHomeHolder(val binding: RowItemHomeBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHomeHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: MyHomeHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}