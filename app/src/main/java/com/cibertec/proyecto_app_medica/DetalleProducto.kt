package com.cibertec.proyecto_app_medica

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.floatingactionbutton.FloatingActionButton

class DetalleProducto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detalle_producto)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val cartButton: FloatingActionButton = findViewById(R.id.cart_button)

        cartButton.setOnClickListener {
            showOrderSummary()
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
            bottomSheetDialog.dismiss()
        }

        bottomSheetDialog.show()
    }

}