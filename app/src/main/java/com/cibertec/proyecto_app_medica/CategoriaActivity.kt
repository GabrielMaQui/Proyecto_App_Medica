package com.cibertec.proyecto_app_medica

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

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
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        enlazando()

        usandoVariables()
    }

    private fun enlazando() {
        AseoPersonal = findViewById(R.id.iv_aseoPersonal)
        Medicamentos = findViewById(R.id.iv_medicamentos)
        Belleza = findViewById(R.id.iv_belleza)
        ProductosMaternos = findViewById(R.id.iv_productos_maternos)
        PrimerosAuxilios = findViewById(R.id.iv_primeros_auxilios)
        Nutricion = findViewById(R.id.iv_nutricion)
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
}