package com.cibertec.proyecto_app_medica

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MenuInicialActivity: AppCompatActivity() {

    private lateinit var VerProductos: Button

    private lateinit var pedidos: ImageButton
    private lateinit var menuButton: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.menu_inicial)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        VerProductos = findViewById(R.id.btn_ver_productos)
        VerProductos.setOnClickListener {
            val iniciar = Intent(this, CategoriaActivity::class.java)
            startActivity(iniciar)
        }
        pedidos = findViewById(R.id.btn_orders)
        pedidos.setOnClickListener {
            val pedidos = Intent(this, ListaPedidos::class.java)
            startActivity(pedidos)
        }

        menuButton = findViewById(R.id.menu_button)
        menuButton.setOnClickListener {
            val menu = Intent(this, MenuDesplegableActivity::class.java)
            startActivity(menu)
        }

    }
}