package com.example.groceriesappnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class loginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =inflater.inflate(R.layout.fragment_login, container, false)
        var loginbtn = view.findViewById<Button>(R.id.loginbtn)
        loginbtn.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_singupFragment)
    }
    return view


    }
}