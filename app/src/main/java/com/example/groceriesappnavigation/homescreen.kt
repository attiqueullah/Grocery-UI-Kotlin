package com.example.groceriesappnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.navigation.fragment.findNavController


class homescreen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_homescreen, container, false)
        var apple = view.findViewById<ImageView>(R.id.apple)
        apple.setOnClickListener {
            findNavController().navigate(R.id.action_homescreen_to_productdetailFragment)
    }
    return view

    }
}