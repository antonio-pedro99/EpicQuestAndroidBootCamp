package com.antdev.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var edtNumber1:EditText
    private lateinit var edtNumber2:EditText
    private lateinit var btnCompute:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtNumber1 = findViewById(R.id.edtTxtNum1)
        edtNumber2 = findViewById(R.id.edtTxtNum2)
        btnCompute = findViewById(R.id.btnComputer)

        btnCompute.setOnClickListener{
            val number2:Int = edtNumber2.text.toString().toInt();
            val number1:Int = edtNumber1.text.toString().toInt();

            val result = number1 + number2;
            Toast.makeText(this, "Button clicked $result", Toast.LENGTH_LONG).show()
        }
    }



}