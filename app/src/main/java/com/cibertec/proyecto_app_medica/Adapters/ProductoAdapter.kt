package com.cibertec.proyecto_app_medica.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.cibertec.proyecto_app_medica.Entidades.Producto
import com.cibertec.proyecto_app_medica.R

class ProductoAdapter (val productos: List<Producto>) : RecyclerView.Adapter<ProductoAdapter.ProductosHolder>(), View.OnClickListener {

    private lateinit var listener: View.OnClickListener

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductoAdapter.ProductosHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.item_list_productos, parent, false)
        view.setOnClickListener(this)
        return ProductosHolder(view)
    }

    override fun onBindViewHolder(holder: ProductoAdapter.ProductosHolder, position: Int) {
        val item = productos[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return productos.size
    }

    class ProductosHolder(inflate: View) : RecyclerView.ViewHolder(inflate) {
        var nombre: TextView = inflate.findViewById(R.id.tv_nombre_producto)
        var precio: TextView = inflate.findViewById(R.id.tv_precio_producto)
        var disponible: TextView = inflate.findViewById(R.id.tv_disponible_producto)
        fun bind(producto: Producto) {
            nombre.text = producto.nombre
            precio.text = producto.precio
            disponible.text = producto.disponible.toString()
        }
    }

    fun setOnClickListener(listener: View.OnClickListener) {
        this.listener = listener
    }

    override fun onClick(v: View?) {
        if (listener != null) {
            listener.onClick(v);
        }
    }
}