package com.example.myapplicationsample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    private var myText:String?  = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val edInput = findViewById<TextView>(R.id.ed_input)
        val btShowText = findViewById<Button>(R.id.bt_showText)
        val txtShowedText = findViewById<TextView>(R.id.txt_showed_text)
        val btGotoPage2 = findViewById<Button>(R.id.bt_gotoPage2)

        btShowText.setOnClickListener {
            myText=edInput.text
            txtShowedText.text=mytext
        }
        btGotoPage2.setOnClickListener {
            val gotoPage2Intent= Intent(this,Page2Activity::class.java)
            gotoPage2Intent.putExtra("text_key",myText)
            startActivity(gotoPage2Intent)
        }
    }
}