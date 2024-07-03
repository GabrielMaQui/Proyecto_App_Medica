package com.cibertec.proyecto_app_medica

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class CategoriaActivity: AppCompatActivity() {

    private lateinit var AseoPersonal: ImageView
    private lateinit var Medicamentos: ImageView
    private lateinit var Belleza: ImageView
    private lateinit var ProductosMaternos: ImageView
    private lateinit var PrimerosAuxilios: ImageView
    private lateinit var Nutricion: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.list_categorias)

        binding()

        usandoVariables()
    }

    private fun usandoVariables() {
        AseoPersonal.setOnClickListener {
            val list = Intent(this, ListaProductosActivity::class.java)
            startActivity(list)
        }
        Medicamentos.setOnClickListener {
            val list = Intent(this, ListaProductosActivity::class.java)
            startActivity(list)
        }
        Belleza.setOnClickListener {
            val list = Intent(this, ListaProductosActivity::class.java)
            startActivity(list)
        }
        ProductosMaternos.setOnClickListener {
            val list = Intent(this, ListaProductosActivity::class.java)
            startActivity(list)
        }
        PrimerosAuxilios.setOnClickListener {
            val list = Intent(this, ListaProductosActivity::class.java)
            startActivity(list)
        }
        Nutricion.setOnClickListener {
            val list = Intent(this, ListaProductosActivity::class.java)
            startActivity(list)
        }
    }

    private fun binding() {
        AseoPersonal = findViewById(R.id.iv_aseoPersonal)
        Medicamentos = findViewById(R.id.iv_aseoPersonal)
        Belleza = findViewById(R.id.iv_aseoPersonal)
        ProductosMaternos = findViewById(R.id.iv_aseoPersonal)
        PrimerosAuxilios = findViewById(R.id.iv_aseoPersonal)
        Nutricion = findViewById(R.id.iv_aseoPersonal)
    }

}