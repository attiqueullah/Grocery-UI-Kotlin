package com.example.groceriesappnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class selectlocFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
         val view =inflater.inflate(R.layout.fragment_selectloc, container, false)
        var submitbtnloc = view.findViewById<Button>(R.id.submitbtnloc)
        submitbtnloc.setOnClickListener {
            findNavController().navigate(R.id.action_selectlocFragment_to_loginFragment)
    }
    return view

    }
}