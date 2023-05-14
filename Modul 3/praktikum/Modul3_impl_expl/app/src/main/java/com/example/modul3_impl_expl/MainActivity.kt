package com.example.modul3_impl_expl

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button


class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btndata = findViewById<Button>(R.id.btnExplicit)
        btndata.setOnClickListener(View.OnClickListener { val intent = Intent(this, DetailActivity::class.java)
        startActivity(intent)
        })

        val btnfacebook: Button = findViewById(R.id.btnImplicit)
        btnfacebook.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btnImplicit-> {
                val url = "https://www.facebook.com/"
                val web = Intent(Intent.ACTION_VIEW)
                web.data = Uri.parse(url)
                startActivity(web)
            }
        }
    }

}

