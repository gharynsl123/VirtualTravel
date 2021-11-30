package com.example.virtualtravel.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.virtualtravel.Detail.DetailExplore
import com.example.virtualtravel.Detail.DetailHome
import com.example.virtualtravel.data.Explore
import com.example.virtualtravel.databinding.RowItemExploreBinding

class ExploreAdapter(private val listExplore: ArrayList<Explore>) :
    RecyclerView.Adapter<ExploreAdapter.MyExploreHolder>() {

    inner class MyExploreHolder(val binding: RowItemExploreBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)= MyExploreHolder (
        RowItemExploreBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: MyExploreHolder, position: Int) {
        holder.binding.apply {
            with(listExplore[position]){
                tvNameExplore.text = nameEx
                tvCategoryExplore.text = cateEx
                tvPriceExplore.text = priceEx
                Glide.with(imgExplore.context).load(photoEx).into(imgExplore)
                holder.itemView.setOnClickListener {
                    val intent = Intent(it.context, DetailExplore::class.java)
                    intent.putExtra(DetailExplore.EXPLORE_DATA, listExplore[position])
                    it.context.startActivity(intent)
                }
            }
        }
    }

    override fun getItemCount(): Int = listExplore.size
}