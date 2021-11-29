package com.example.virtualtravel.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.virtualtravel.Detail.DetailHome
import com.example.virtualtravel.data.Home
import com.example.virtualtravel.databinding.RowItemHomeBinding


class HomeAdapeter(private val listHome: ArrayList<Home>) :
    RecyclerView.Adapter<HomeAdapeter.MyHomeHolder>() {


    inner class MyHomeHolder(val binding: RowItemHomeBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MyHomeHolder(
        RowItemHomeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: MyHomeHolder, position: Int) {
        holder.binding.apply {
            with(listHome[position]) {
                tvTitle.text = nameHom
                tvInfo.text = infoHom
                tvPrice.text = priceHom
                Glide.with(imgItem.context).load(photoHom).into(imgItem)
                holder.itemView.setOnClickListener {
                    val intent = Intent(it.context, DetailHome::class.java)

                    it.context.startActivity(intent)
                }
            }
        }
    }

    override fun getItemCount(): Int = listHome.size
}