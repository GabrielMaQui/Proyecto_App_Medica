package com.cibertec.proyecto_app_medica

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ListaPedidos : AppCompatActivity() {

    private lateinit var backButton: ImageButton
    private lateinit var volver: Button
    private lateinit var cancelar: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_lista_pedidos)

        backButton = findViewById(R.id.back_button)
        backButton.setOnClickListener {
            //val volver = Intent(this, DetalleProducto::class.java)
            //startActivity(volver)
            finish()
        }

        volver = findViewById(R.id.btn_volver)
        volver.setOnClickListener {
            //val detalle = Intent(this, DetalleProducto::class.java)
            //startActivity(detalle)
            finish()
        }

        cancelar = findViewById(R.id.iv_cancelar)
        cancelar.setOnClickListener {
            val builder: AlertDialog.Builder = AlertDialog.Builder(this)
            builder
                .setTitle("¿Desea cancelar este pedido?")
                .setPositiveButton("Si") { dialog, which ->
                    finish()
                    Toast.makeText(this, "Pedido cancelado",Toast.LENGTH_LONG).show()
                }
                .setNegativeButton("No") { dialog, which ->
                    // Do something else.
                }

            val dialog: AlertDialog = builder.create()
            dialog.show()
        }
    }
}