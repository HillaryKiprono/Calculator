package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {


    lateinit var button1:android.widget.Button
    lateinit var button2:android.widget.Button
    lateinit var button3:android.widget.Button
    lateinit var button4:android.widget.Button
    lateinit var button5:android.widget.Button
    lateinit var button6:android.widget.Button
    lateinit var button7:android.widget.Button
    lateinit var button8:android.widget.Button
    lateinit var button0:android.widget.Button
    lateinit var button00:android.widget.Button

    lateinit var buttonpercent:android.widget.Button
    lateinit var buttonclear:android.widget.Button
    lateinit var buttondot:android.widget.Button
    lateinit var buttonequal:android.widget.Button
    lateinit var buttonadd:android.widget.Button


    lateinit var inputx:EditText
    lateinit var resulttext:EditText

    var check=0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button0=findViewById(R.id.btn0)
        button1=findViewById(R.id.btn1)
        button2=findViewById(R.id.btn2)
        button3=findViewById(R.id.btn3)
        button4=findViewById(R.id.btn4)
        button5=findViewById(R.id.btn5)
        button6=findViewById(R.id.btn6)
        button7=findViewById(R.id.btn7)
        button8=findViewById(R.id.btn8)
        button00=findViewById(R.id.btn00)
        buttonpercent=findViewById(R.id.btnpercent)
        buttonclear=findViewById(R.id.btnclear)
        buttondot=findViewById(R.id.btndot)
        buttonequal=findViewById(R.id.btnequal)
        buttonadd=findViewById(R.id.btnadd)
        button0=findViewById(R.id.btn0)

    }
}