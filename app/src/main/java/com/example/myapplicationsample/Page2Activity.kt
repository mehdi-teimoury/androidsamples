package com.example.myapplicationsample

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Page2Activity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_page2)
            var myGetText: String = intent.extras.getString("text_key")

        val btBack=findViewById<Button>(R.id.btBack)

        btBack.setOnClickListener {
            val BackIntent = Intent(this,MainActivity::class.java)
            startActivity(BackIntent)
        }
    }

}