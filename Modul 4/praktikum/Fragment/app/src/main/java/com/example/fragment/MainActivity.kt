package com.example.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.fragment.Fragments.Fragment1
import com.example.fragment.Fragments.Fragment2

class MainActivity : AppCompatActivity(),Communicator {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment1 = Fragment1()
        //to start the app with fragment 1
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container,fragment1).commit()
    }

    override fun passData(editTextData: String) {
        val bundle = Bundle()
        bundle.putString("message",editTextData)

        val transaction = this.supportFragmentManager.beginTransaction()
        val fragment2 = Fragment2()

        fragment2.arguments = bundle

        // to pass data tp fragment 2 and open it
        transaction.replace(R.id.fragment_container,fragment2).commit()
    }
}