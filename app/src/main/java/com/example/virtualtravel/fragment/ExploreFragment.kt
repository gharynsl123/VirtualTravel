package com.example.virtualtravel.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.virtualtravel.R
import com.example.virtualtravel.adapter.ExploreAdapter
import com.example.virtualtravel.data.DataExplore
import com.example.virtualtravel.databinding.FragmentExploreBinding

class ExploreFragment : Fragment() {

    private var binding: FragmentExploreBinding? = null
    private val bind get() = binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentExploreBinding.inflate(inflater, container, false)

        bind.rvExplore.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(activity)
            adapter = ExploreAdapter(DataExplore.listExplore)

        }

        return bind.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}