package com.example.hesapmakinesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var solution: TextView
    lateinit var result: TextView
    lateinit var buttonDivide: Button
    lateinit var buttonPlus: Button
    lateinit var buttonMinus: Button
    lateinit var buttonEquals: Button
    lateinit var buttonC: Button
    lateinit var buttonBrackOpen: Button
    lateinit var button0: Button
    lateinit var button1: Button
    lateinit var button2: Button
    lateinit var button3: Button
    lateinit var button4: Button
    lateinit var button5: Button
    lateinit var button6: Button
    lateinit var button7: Button
    lateinit var button8: Button
    lateinit var button9: Button
    lateinit var buttonmultipy: Button
    lateinit var buttonAc: Button
    lateinit var buttondot: Button
    private var ilksayi: String? = null
    private var islemtipi: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        solution = findViewById<TextView>(R.id.solution_tv)
        result = findViewById<TextView>(R.id.result_tv)
        buttonDivide = findViewById<Button>(R.id.buttondivide)
        buttonPlus = findViewById<Button>(R.id.buttonplus)
        buttonMinus = findViewById<Button>(R.id.buttonminus)
        buttonEquals = findViewById<Button>(R.id.buttonequals)
        buttonC = findViewById<Button>(R.id.buttonc)
        buttonBrackOpen = findViewById<Button>(R.id.buttonclosebracket)
        button0 = findViewById<Button>(R.id.button0)
        button1 = findViewById<Button>(R.id.button1)
        button2 = findViewById<Button>(R.id.button2)
        button3 = findViewById<Button>(R.id.button3)
        button4 = findViewById<Button>(R.id.button4)
        button5 = findViewById<Button>(R.id.button5)
        button6 = findViewById<Button>(R.id.button6)
        button7 = findViewById<Button>(R.id.button7)
        button8 = findViewById<Button>(R.id.button8)
        button9 = findViewById<Button>(R.id.button9)
        buttonAc = findViewById<Button>(R.id.buttonac)
        buttondot =findViewById<Button>(R.id.buttondot)
        buttonmultipy = findViewById<Button>(R.id.buttonmultiply)
        button0.setOnClickListener() {
            sayigiris(button0.text.toString())
        }
        button1.setOnClickListener() {
            sayigiris(button1.text.toString())
        }
        button2.setOnClickListener() {
            sayigiris(button2.text.toString())
        }
        button3.setOnClickListener() {
            sayigiris(button3.text.toString())
        }
        button4.setOnClickListener() {
            sayigiris(button4.text.toString())
        }
        button5.setOnClickListener() {
            sayigiris(button5.text.toString())
        }
        button6.setOnClickListener() {
            sayigiris(button6.text.toString())
        }
        button7.setOnClickListener() {
            sayigiris(button7.text.toString())
        }
        button8.setOnClickListener() {
            sayigiris(button8.text.toString())
        }
        button9.setOnClickListener() {
            sayigiris(button9.text.toString())
        }
        buttondot.setOnClickListener(){
            sayigiris(buttondot.text.toString())
        }
        buttonC.setOnClickListener {
            cButton()
        }
        buttonAc.setOnClickListener {
            acButton()
        }
        buttonPlus.setOnClickListener() {
            islem("+")
        }
        buttonMinus.setOnClickListener() {
            islem("-")
        }
        buttonEquals.setOnClickListener() {
            islem(null)
        }
        buttonDivide.setOnClickListener() {
            islem("/")
        }
        buttonmultipy.setOnClickListener() {
            islem("*")
        }
    }

    fun sayigiris(sayi: String) {
        result.text = if (result.text.toString() == "0") {
            sayi
        } else {
            result.text.toString() + sayi
        }

    }

    fun cButton() {
        result.text = "0"
    }

    fun acButton() {
        ilksayi = null
        islemtipi = null
        result.text = "0"
        solution.text = "0"
    }

    fun createResult(op: String, sayi1: Double, sayi2: Double): Double {
        when (op) {
            "+" -> return (sayi1 + sayi2).toDouble()
            "-" -> return (sayi1 - sayi2).toDouble()
            "*" -> return (sayi1 * sayi2).toDouble()
            "/" -> return (sayi1 / sayi2).toDouble()
            else -> return 0.0

        }

    }


    fun islem(tip: String?) {

        if (ilksayi == null) {
            ilksayi = result.text.toString()


        } else {
            var first = ilksayi!!.toDouble()
            var second = result.text.toString().toDouble()
            var sonuc = createResult(islemtipi!!, first, second)
            ilksayi = sonuc.toString()

        }
        islemtipi = tip
        solution.text = ilksayi
        result.text = "0"
        if (tip == null) {
            ilksayi = null
        }

    }


}