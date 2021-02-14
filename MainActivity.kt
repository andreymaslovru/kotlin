package com.example.lab01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // МАСЛОВ АНДРЕЙ СЕРГЕЕВИЧ 8В92

    private var count: Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun myButtonClickPlus(view: View) {
        // Получаем первое число
        val edit1: EditText = findViewById(R.id.number1)
        val n1 = edit1.text.toString().toFloat()
        // Получаем второе число
        val edit2: EditText = findViewById(R.id.number2)
        val n2 = edit2.text.toString().toFloat()
        // Помещаем результат +  в текстовое поле
        val n = n1 + n2
        val textView: TextView = findViewById(R.id.result)
        val resText = resources.getString(R.string.operation_result)
        textView.text = String.format(resText, n)
    }
    fun myButtonClickMinus(view: View) {
        // Получаем первое число
        val edit1: EditText = findViewById(R.id.number1)
        val n1 = edit1.text.toString().toFloat()
        // Получаем второе число
        val edit2: EditText = findViewById(R.id.number2)
        val n2 = edit2.text.toString().toFloat()
        // Помещаем результат -  в текстовое поле
        val n = n1 - n2
        val textView: TextView = findViewById(R.id.result)
        val resText = resources.getString(R.string.operation_result)
        textView.text = String.format(resText, n)
    }
    fun myButtonClickFraction(view: View) {
        // Получаем первое число
        val edit1: EditText = findViewById(R.id.number1)
        val n1 = edit1.text.toString().toFloat()
        // Получаем второе число
        val edit2: EditText = findViewById(R.id.number2)
        val n2 = edit2.text.toString().toFloat()
        // Помещаем результат /  в текстовое поле
        val n = n1 / n2
        val textView: TextView = findViewById(R.id.result)
        val resText = resources.getString(R.string.operation_result)
        textView.text = String.format(resText, n)
    }
    fun myButtonClickMult(view: View) {
        // Получаем первое число
        val edit1: EditText = findViewById(R.id.number1)
        val n1 = edit1.text.toString().toFloat()
        // Получаем второе число
        val edit2: EditText = findViewById(R.id.number2)
        val n2 = edit2.text.toString().toFloat()
        // Помещаем результат *  в текстовое поле
        val n = n1 * n2
        val textView: TextView = findViewById(R.id.result)
        val resText = resources.getString(R.string.operation_result)
        textView.text = String.format(resText, n)
    }

}