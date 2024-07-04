package com.cibertec.proyecto_app_medica

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
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
    private lateinit var pedidos: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.list_categorias)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        pedidos = findViewById(R.id.btn_orders)
        pedidos.setOnClickListener {
            val pedidos = Intent(this, ListaPedidos::class.java)
            startActivity(pedidos)
        }

        AseoPersonal = findViewById(R.id.iv_aseoPersonal)
        AseoPersonal.setOnClickListener {
            val list = Intent(this, ListaProductosActivity::class.java)
            startActivity(list)
        }

        Medicamentos = findViewById(R.id.iv_medicamentos)
        Medicamentos.setOnClickListener {
            val list = Intent(this, ListaProductosActivity::class.java)
            startActivity(list)
        }

        Belleza = findViewById(R.id.iv_belleza)
        Belleza.setOnClickListener {
            val list = Intent(this, ListaProductosActivity::class.java)
            startActivity(list)
        }

        ProductosMaternos = findViewById(R.id.iv_productos_maternos)
        ProductosMaternos.setOnClickListener {
            val list = Intent(this, ListaProductosActivity::class.java)
            startActivity(list)
        }

        PrimerosAuxilios = findViewById(R.id.iv_primeros_auxilios)
        PrimerosAuxilios.setOnClickListener {
            val list = Intent(this, ListaProductosActivity::class.java)
            startActivity(list)
        }

        Nutricion = findViewById(R.id.iv_nutricion)
        Nutricion.setOnClickListener {
            val list = Intent(this, ListaProductosActivity::class.java)
            startActivity(list)
        }
    }
}