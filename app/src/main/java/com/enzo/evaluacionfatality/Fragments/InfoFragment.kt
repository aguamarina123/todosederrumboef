package com.enzo.evaluacionfatality.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.enzo.evaluacionfatality.R
import com.enzo.evaluacionfatality.databinding.FragmentConBinding
import com.enzo.evaluacionfatality.databinding.FragmentInfoBinding


class InfoFragment : Fragment() {
    private lateinit var binding: FragmentInfoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_info, container, false)
        binding = FragmentInfoBinding.inflate(inflater, container, false)
        return binding.root
    }

}