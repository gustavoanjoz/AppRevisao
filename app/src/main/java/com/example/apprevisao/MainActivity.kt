package com.example.apprevisao

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Size
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.text.isDigitsOnly


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.btnEnter).setOnClickListener{
            comparingNum()
        }
    }
    private fun comparingNum(){
        val result = findViewById<TextView>(R.id.textResult)

        val num1 = findViewById<EditText>(R.id.num1)
        val num2 = findViewById<EditText>(R.id.num2)

        if(num1.text.isNotEmpty() && num2.text.isNotBlank()){

            val valor1 = Integer.parseInt(num1.text.toString())
            val valor2 = Integer.parseInt(num2.text.toString())
            result.setTextColor(Color.parseColor("#FF3700B3"))

            when{
                valor1 > valor2 -> {
                    result.text = String.format("%d é maior que %d.",valor1, valor2)
                }
                valor1 < valor2 -> {
                    result.text = String.format("%d é menor que %d.",valor1, valor2)
                }
                else->{
                    result.text = String.format("%d é igual a %d.",valor1, valor2)
                }
            }
        }
        else{
            result.text = "Inválido"
        }
    }
}