package com.example.shoppingcard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun addToCount(view : View){

        when(view.id){
            R.id.appleplus -> applecount.text =  (applecount.text.toString().toInt() + 1).toString();
            R.id.bananaplus ->bananacount.text = (bananacount.text.toString().toInt() + 1).toString();
            R.id.pineappleplus -> pineapplecount.text = (pineapplecount.text.toString().toInt() + 1).toString();
        }
    }
    fun decreaseCount(view : View){
        when(view.id){

            R.id.appleminus ->if(isNegative(applecount.text.toString().toInt())){ applecount.text = (applecount.text.toString().toInt() - 1).toString()};
            R.id.bananaminus -> if(isNegative(bananacount.text.toString().toInt())){bananacount.text = (bananacount.text.toString().toInt() - 1).toString()};
            R.id.pineappleminus -> if(isNegative(pineapplecount.text.toString().toInt())){pineapplecount.text = (pineapplecount.text.toString().toInt() - 1).toString()};
        }
    }
    fun isNegative(a : Int) : Boolean{
        if(a < 1){
            return false;
        }
        return true;
    }
    fun checkout(view: View){
        val intent = Intent(applicationContext, Checkout::class.java);
        val total = ((applecount.text.toString().toInt() * 1.25) + (bananacount.text.toString().toInt()) + (pineapplecount.text.toString().toInt() * 3.49)).toString();
        println(total);
        intent.putExtra("total", total);
        startActivity(intent);
    }
}