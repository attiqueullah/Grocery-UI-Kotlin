package com.example.groceriesappnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class singinFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_singin, container, false)
        var google = view.findViewById<Button>(R.id.google)
        google.setOnClickListener {
            findNavController().navigate(R.id.action_singinFragment_to_numberFragment)
        }
        return view
    }
}