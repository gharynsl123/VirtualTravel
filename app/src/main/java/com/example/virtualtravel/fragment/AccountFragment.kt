package com.example.virtualtravel.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.virtualtravel.R
import com.example.virtualtravel.databinding.FragmentAccountBinding


class AccountFragment : Fragment() {

    private var binding:FragmentAccountBinding? = null
    private val bind get() = binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAccountBinding.inflate(inflater, container, false)

        return bind.root
    }

}