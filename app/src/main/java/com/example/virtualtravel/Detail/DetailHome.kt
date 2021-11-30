package com.example.virtualtravel.Detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bumptech.glide.Glide
import com.example.virtualtravel.R
import com.example.virtualtravel.data.Home
import com.example.virtualtravel.databinding.ActivityDetailHomeBinding

class DetailHome : AppCompatActivity() {

    private lateinit var binding: ActivityDetailHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //hide Action Bar
        supportActionBar?.hide()
        //Cutsom Toas
        val layout = layoutInflater.inflate(R.layout.custom_dialog, null)
        binding.rlButton.setOnClickListener {
            Toast(this@DetailHome).apply {
                duration = Toast.LENGTH_SHORT
                view = layout
            }
                .show()
        }

        //Put Extra
        val dataHome = intent.getParcelableExtra<Home>(HOME_DATA) as Home
        Glide.with(this).load(dataHome.photoHom).into(binding.imgHome)
        binding.apply {
            nameDetail.text = dataHome.nameHom
            hargaDetail.text = dataHome.priceHom
            infoDetail.text = dataHome.infoHom
            linkDetail.text = dataHome.locatHom
            descDetail.text = dataHome.descHom
        }

    }
    //Object
    companion object {
        const val HOME_DATA = "0"
    }
}