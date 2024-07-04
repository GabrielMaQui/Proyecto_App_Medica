package com.cibertec.proyecto_app_medica

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cibertec.proyecto_app_medica.Adapters.ProductoAdapter
import com.cibertec.proyecto_app_medica.Entidades.Producto

class ListaProductosActivity: AppCompatActivity() {

    private lateinit var Volver: Button
    private lateinit var adapter: ProductoAdapter
    private lateinit var listaProductos: ArrayList<Producto>

    private lateinit var backButton: ImageButton
    private lateinit var producto: CardView

    private lateinit var pedidos: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.list_productos)
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

        Volver = findViewById(R.id.btn_volver)
        Volver.setOnClickListener {
            val volver = Intent(this, CategoriaActivity::class.java)
            startActivity(volver)
        }

        backButton = findViewById(R.id.back_button)
        backButton.setOnClickListener {
            val volver = Intent(this, CategoriaActivity::class.java)
            startActivity(volver)
        }

        producto = findViewById(R.id.cv_producto)
        producto.setOnClickListener {
            val detalle = Intent(this, DetalleProducto::class.java)
            startActivity(detalle)
        }

        listaProductos = ArrayList<Producto>();
        adapter = ProductoAdapter(listaProductos)
        /*val recyclerView: RecyclerView = findViewById(R.id.rv_listadoProductos)
        val layoutManager: LinearLayoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter
        //layoutManager.adapter = adapter


        adapter.setOnClickListener({
            detalleProducto(listaProductos.get(recyclerView.getChildAdapterPosition(it)))
        })

        adapter.notifyDataSetChanged()*/
    }
    private fun detalleProducto(producto: Producto) {
        val detalle: Intent
        detalle = Intent(this, DetalleProducto::class.java)
        detalle.putExtra("KEY_PRODUCTO", producto.key)
        startActivity(detalle)
    }
}