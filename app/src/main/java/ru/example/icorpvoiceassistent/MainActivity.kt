package ru.example.icorpvoiceassistent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name: String = "Ziganshin"
        val surname: String = "Ilmir"
        var age: Int = 23
        var height: Double = 178.0

        age = 27
        age = 22

        age = age+1
        age += 1
        age++

        val summary: String = "name: $name surname: $surname age: $age "

        val output: TextView = findViewById(R.id.output)
        output.text = summary


    }
}