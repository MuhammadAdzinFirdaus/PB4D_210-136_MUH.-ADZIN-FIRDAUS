package com.example.fragment.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.example.fragment.Communicator
import com.example.fragment.R

class Fragment1 : Fragment() {
    private lateinit var communicator: Communicator
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_1, container, false)
        val btn : Button = view.findViewById(R.id.submit)
        val editText : EditText = view.findViewById(R.id.input)
        communicator = activity as Communicator
        btn.setOnClickListener {
            communicator.passData(editText.text.toString())
        }
        return view
    }

}