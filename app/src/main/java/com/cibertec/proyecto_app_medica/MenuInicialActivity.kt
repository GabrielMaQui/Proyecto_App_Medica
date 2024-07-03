package com.cibertec.proyecto_app_medica

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MenuInicialActivity: AppCompatActivity() {

    private lateinit var VerProductos: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.menu_inicial)

        VerProductos = findViewById(R.id.btn_ver_productos)
        VerProductos.setOnClickListener {
            val iniciar = Intent(this, ListaProductosActivity::class.java)
            startActivity(iniciar)
        }


    }
}