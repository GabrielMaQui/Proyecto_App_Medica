package com.cibertec.proyecto_app_medica

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class RegistrarCuentaActivity: AppCompatActivity() {

    private lateinit var CrearCuenta: Button
    private lateinit var IniciaSesionAqui: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.registrar_cuenta)

        CrearCuenta = findViewById(R.id.btn_crear_cuenta)
        CrearCuenta.setOnClickListener {
            Toast.makeText(this, "Cuenta Creada con éxito",Toast.LENGTH_LONG).show()
            val iniciar = Intent(this, MainActivity::class.java)
            startActivity(iniciar)
        }

        IniciaSesionAqui = findViewById(R.id.tv_inicia_sesion_aqui)
        IniciaSesionAqui.setOnClickListener {
            val iniciar = Intent(this, MainActivity::class.java)
            startActivity(iniciar)
        }

    }
}