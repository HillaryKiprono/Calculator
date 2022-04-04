package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.EditText
import java.lang.StringBuilder

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
    lateinit var buttonmult:android.widget.Button
    lateinit var buttondivide:android.widget.Button
    lateinit var buttonsub:android.widget.Button
    lateinit var buttonequal:android.widget.Button
    lateinit var buttonadd:android.widget.Button
    lateinit var button9:android.widget.Button
    lateinit var buttonbackspace:android.widget.Button

    lateinit var inputext:EditText
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
        button9=findViewById(R.id.btn9)
        button00=findViewById(R.id.btn00)
        buttonpercent=findViewById(R.id.btnpercent)
        buttonclear=findViewById(R.id.btnclear)
        buttondot=findViewById(R.id.btndot)
        buttonequal=findViewById(R.id.btnequal)
        buttonadd=findViewById(R.id.btnadd)
        button0=findViewById(R.id.btn0)
        inputext=findViewById(R.id.inputnumber)
        inputext.movementMethod=ScrollingMovementMethod()
//        inputext.isActivated(true)
//        inputext.isPressed(true)

        var text:String

        button1.setOnClickListener {  
            text=inputext.text.toString() + "1"
            inputext.setText(text)
            result(text)
        }

        button2.setOnClickListener {
            text=inputext.text.toString() + "2"
            inputext.setText(text)
            result(text)
        }

        button3.setOnClickListener {
            text=inputext.text.toString() + "3"
            inputext.setText(text)
            result(text)
        }

        button4.setOnClickListener {
            text=inputext.text.toString() + "4"
            inputext.setText(text)
            result(text)
        }

        button5.setOnClickListener {
            text=inputext.text.toString() + "5"
            inputext.setText(text)
            result(text)
        }

        button6.setOnClickListener {
            text=inputext.text.toString() + "6"
            inputext.setText(text)
            result(text)
        }

        button7.setOnClickListener {
            text=inputext.text.toString() + "7"
            inputext.setText(text)
            result(text)
        }

        button8.setOnClickListener {
            text=inputext.text.toString() + "8"
            inputext.setText(text)
            result(text)
        }
        button9.setOnClickListener {
            text=inputext.text.toString() + "9"
            inputext.setText(text)
            result(text)
        }

        button0.setOnClickListener {
            text=inputext.text.toString() + "0"
            inputext.setText(text)
            result(text)
        }

        button00.setOnClickListener {
            text=inputext.text.toString() + "00"
            inputext.setText(text)
            result(text)
        }

        buttondot.setOnClickListener {
            text=inputext.text.toString() + "."
            inputext.setText(text)
            result(text)
        }

        buttonadd.setOnClickListener {
            text=inputext.text.toString()+ "+";
            inputext.setText(text)
            check=check+1
        }

        buttonmult.setOnClickListener {
            text=inputext.text.toString()+ "*";
            inputext.setText(text)
            check=check+1
        }

        buttonsub.setOnClickListener {
            text=inputext.text.toString()+ "-";
            inputext.setText(text)
            check=check+1
        }

        buttondivide.setOnClickListener {
            text=inputext.text.toString()+ "/";
            inputext.setText(text)
            check=check+1
        }
        buttonpercent.setOnClickListener {
            text=inputext.text.toString()+ "%";
            inputext.setText(text)
            check=check+1
        }

        buttonequal.setOnClickListener {
            text=resulttext.text.toString()
            inputext.setText(null)
        }
        buttonclear.setOnClickListener {
          inputext.setText(null)
          resulttext.setText(null)
        }

        buttonbackspace.setOnClickListener {
            var BackspaCE:String?=null
            if(inputext.text.length>0)
            {
                val stringBuilder:StringBuilder=StringBuilder(inputext.text)
                val find=inputext.toString()
                val  find2=find.last()

                if(find2.equals('+')|| find2.equals('-') || find2.equals('/')|| find2.equals(('%')))
                {
                  check=check-1
                }
                stringBuilder.deleteCharAt(inputext.text.length-1)
                BackspaCE=stringBuilder.toString()
                inputext.setText(BackspaCE)
                result(BackspaCE)
            }

        }









    }

    private fun result(text: String) {

    }
}