package com.cibertec.proyecto_app_medica.Entidades

data class Producto(
    var key: String? = null,
    var codigo: Int? = 0,
    var nombre: String? = null,
    var precio: String? = null,
    var stock: String? = null,
    var marca: String? = null,
    var disponible: Boolean = true,
    var categoria: Categoria
)
