package com.example.rolldice

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollbtn = findViewById<Button>(R.id.Roll)
        rollbtn.setOnClickListener{
            rollDice()
        }

    }


    fun rollDice() {
        val dicenum = findViewById<TextView>(R.id.TextView)
        val RandomNum = Random.nextInt(6)+1
        dicenum.text= RandomNum.toString()
    }
}
