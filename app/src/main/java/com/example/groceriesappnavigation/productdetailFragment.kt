package com.example.groceriesappnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class productdetailFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_productdetail, container, false)
        var basket=view.findViewById<Button>(R.id.basket)
        basket.setOnClickListener {
            findNavController().navigate(R.id.action_productdetailFragment_to_exploreFragment)
    }

    return view
    }
}