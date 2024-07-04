package com.cibertec.proyecto_app_medica

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var IniciarSesion: AppCompatButton
    private lateinit var Registrate: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        IniciarSesion = findViewById(R.id.btn_iniciar_sesion)
        IniciarSesion.setOnClickListener {
            val menu = Intent(this, MenuInicialActivity::class.java)
            startActivity(menu)
        }

        Registrate = findViewById(R.id.tv_registrate)
        Registrate.setOnClickListener {
            val registro = Intent(this, RegistrarCuentaActivity::class.java)
            startActivity(registro)
        }
    }

}