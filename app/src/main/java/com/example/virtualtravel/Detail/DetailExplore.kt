package com.example.virtualtravel.Detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import com.bumptech.glide.Glide
import com.example.virtualtravel.R
import com.example.virtualtravel.data.Explore
import com.example.virtualtravel.data.Home
import com.example.virtualtravel.databinding.ActivityDetailHomeBinding
import com.example.virtualtravel.databinding.RowItemExploreBinding

class DetailExplore : AppCompatActivity() {

    private lateinit var binding: ActivityDetailHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()


        val layout = layoutInflater.inflate(R.layout.custom_dialog, null)
        binding.rlButton.setOnClickListener {
            Toast(this@DetailExplore).apply {
                duration = Toast.LENGTH_SHORT
                view = layout
            }
                .show()
        }

        val dataExplore = intent.getParcelableExtra<Explore>(EXPLORE_DATA) as Explore
        Glide.with(this).load(dataExplore.photoEx).into(binding.imgHome)
        binding.apply {
            nameDetail.text = dataExplore.nameEx
            hargaDetail.text = dataExplore.priceEx
            infoDetail.text = dataExplore.cateEx
            linkDetail.text = dataExplore.locatEx
            descDetail.text = dataExplore.descEx
        }

    }

    companion object {
        const val EXPLORE_DATA = "0"
    }
}