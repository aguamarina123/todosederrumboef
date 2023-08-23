package com.enzo.evaluacionfatality.Fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.enzo.evaluacionfatality.Login
import com.enzo.evaluacionfatality.MainActivity
import com.enzo.evaluacionfatality.R
import com.enzo.evaluacionfatality.databinding.FragmentInfoBinding
import com.enzo.evaluacionfatality.databinding.FragmentSalirBinding

class SalirFragment : Fragment() {
    private lateinit var binding: FragmentSalirBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSalirBinding.inflate(inflater, container, false)
        return binding.root

    }
}
