package com.enzo.evaluacionfatality.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.enzo.evaluacionfatality.R
import com.enzo.evaluacionfatality.databinding.FragmentConBinding


class ConFragment : Fragment() {
    private lateinit var binding:FragmentConBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //val view= inflater.inflate(R.layout.fragment_con, container, false)
        binding = FragmentConBinding.inflate(inflater, container, false)
        return binding.root
    }
}