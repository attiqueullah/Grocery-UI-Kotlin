package com.example.groceriesappnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class singupFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_singup, container, false)
        var singupbtn = view.findViewById<Button>(R.id.singupbtn)
        singupbtn.setOnClickListener {
            findNavController().navigate(R.id.action_singupFragment_to_homescreen)
    }
    return view

    }
}