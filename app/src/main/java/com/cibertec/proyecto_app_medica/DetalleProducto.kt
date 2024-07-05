package com.cibertec.proyecto_app_medica

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.floatingactionbutton.FloatingActionButton

class DetalleProducto : AppCompatActivity() {

    private lateinit var addCarrito: AppCompatButton
    private lateinit var volver: Button
    private lateinit var backbutton: ImageButton
    private lateinit var pedidos: ImageButton
    private lateinit var menuButton: ImageView
    private lateinit var home: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detalle_producto)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        menuButton = findViewById(R.id.menu_button)
        menuButton.setOnClickListener {
            val menu = Intent(this, MenuDesplegableActivity::class.java)
            startActivity(menu)
        }

        pedidos = findViewById(R.id.btn_orders)
        pedidos.setOnClickListener {
            val pedidos = Intent(this, ListaPedidos::class.java)
            startActivity(pedidos)
        }

        volver = findViewById(R.id.btn_volver)
        volver.setOnClickListener {
            val volver = Intent(this, ListaProductosActivity::class.java)
            startActivity(volver)
        }

        backbutton = findViewById(R.id.back_button)
        backbutton.setOnClickListener {
            val volver = Intent(this, ListaProductosActivity::class.java)
            startActivity(volver)
        }

        home = findViewById(R.id.btn_home)
        home.setOnClickListener {
            val home = Intent(this, MenuInicialActivity::class.java)
            startActivity(home)
        }

        val cartButton: FloatingActionButton = findViewById(R.id.cart_button)

        cartButton.setOnClickListener {
            showOrderSummary()
        }

        addCarrito = findViewById(R.id.add_to_cart_button)
        addCarrito.setOnClickListener {
            Toast.makeText(this, "",Toast.LENGTH_LONG).show()
            val builder: AlertDialog.Builder = AlertDialog.Builder(this)
            builder
                .setTitle("Producto agregado al carrito")
                .setPositiveButton("Aceptar") { dialog, which ->
                    // Do something.
                }
            val dialog: AlertDialog = builder.create()
            dialog.show()
        }
    }

    private fun showOrderSummary() {
        val bottomSheetDialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.bottom_sheet_order_summary, null)
        bottomSheetDialog.setContentView(view)

        val btnContinueShopping: Button = view.findViewById(R.id.btn_continue_shopping)
        val btnPlaceOrder: Button = view.findViewById(R.id.btn_place_order)

        btnContinueShopping.setOnClickListener {
            // Acción para seguir comprando
            bottomSheetDialog.dismiss()
        }

        btnPlaceOrder.setOnClickListener {
            // Acción para realizar el pedido
            //bottomSheetDialog.dismiss()
            val success = Intent(this, ConfirmacionActivity::class.java)
            startActivity(success)
        }

        bottomSheetDialog.show()
    }

}