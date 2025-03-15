package com.example.salario

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.salario.databinding.ActivityMainBinding
import com.google.android.material.color.utilities.SchemeFruitSalad

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        startApp()
    }

    private fun startApp(){

        binding.bCalcular.setOnClickListener {

            val Horas = binding.etHorasT.text.toString().toInt()

            val Tarifa = binding.etTarifaXHor.text.toString().toInt()

            val SalBrut = (Horas * Tarifa)

            val Deduccion = SalBrut * 0.07

            val SalarioN = SalBrut - Deduccion

            binding.tvSalarioB.text = "$SalBrut"
            binding.tvDeduccionINSS.text = "$Deduccion"
            binding.tvSalarioNeto.text = "El Salario neto es $SalarioN"
        }

        //binding.bCalcular.setOnClickListener {

            //val intent = Intent(this, MainMenu::class.java)
            //startActivity(intent)
            //finish()

        //}
    }
}