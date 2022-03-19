package com.example.shoppingcard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_checkout.*

class Checkout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkout)
        textView2.text = "Total : " + intent.getStringExtra("total");
    }
    fun back(view: View){
        val intent = Intent(applicationContext, MainActivity::class.java);
        startActivity(intent);
    }
}