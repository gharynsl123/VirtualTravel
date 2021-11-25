package com.example.virtualtravel.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.virtualtravel.R
import com.example.virtualtravel.adapter.HomeAdapeter
import com.example.virtualtravel.data.DataHome
import com.example.virtualtravel.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private var binding:FragmentHomeBinding? = null
    private val bind get() = binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentHomeBinding.inflate(inflater, container, false)

        bind.rvHome.apply {
            layoutManager = LinearLayoutManager(activity)
            //Activkan yang di bawah ini jika sudah membuat value
            /*adapter = HomeAdapeter(DataHome.)*/
        }

        return bind.root
    }

}