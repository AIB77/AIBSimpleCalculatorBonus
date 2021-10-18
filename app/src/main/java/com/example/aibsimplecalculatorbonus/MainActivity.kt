package com.example.aibsimplecalculatorbonus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var NUMBER1=findViewById<EditText>(R.id.editTextnum1)
        var NUMBER2=findViewById<EditText>(R.id.editTextnum2)
        var TV=findViewById<TextView>(R.id.tv)
        var ADD=findViewById<Button>(R.id.buttonadd)
        var SUB=findViewById<Button>(R.id.buttonsubtract)
        var MUL=findViewById<Button>(R.id.buttonmultiply)
        var DIV=findViewById<Button>(R.id.buttondivide)

        var Num1=0
        var Num2=0

        ADD.setOnClickListener {

            Num1=NUMBER1.text.toString().toInt()
            Num2=NUMBER2.text.toString().toInt()

            NUMBER1.text.clear()
            NUMBER2.text.clear()


            var r=Num1 + Num2

            TV.text="The Result is ${r}"
        }
        SUB.setOnClickListener {

            Num1=NUMBER1.text.toString().toInt()
            Num2=NUMBER2.text.toString().toInt()

            NUMBER1.text.clear()
            NUMBER2.text.clear()

            var r=Num1 - Num2

            TV.text="The Result is ${r}"
        }
        MUL.setOnClickListener {

            Num1=NUMBER1.text.toString().toInt()
            Num2=NUMBER2.text.toString().toInt()

            NUMBER1.text.clear()
            NUMBER2.text.clear()


            var r=Num1 * Num2

            TV.text="The Result is ${r}"
        }
        DIV.setOnClickListener {

            Num1=NUMBER1.text.toString().toInt()
            Num2=NUMBER2.text.toString().toInt()

            NUMBER1.text.clear()
            NUMBER2.text.clear()


            var r=Num1 / Num2

            TV.text="The Result is ${r}"
        }




    }


}