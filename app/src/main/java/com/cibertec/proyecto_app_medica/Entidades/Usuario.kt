package com.cibertec.proyecto_app_medica.Entidades

data class Usuario(
    var key: String? = null,
    var codigo: Int? = 0,
    var correo: String? = null,
    var password: String? = null,
    var nombre: String? = null,
    var apellido: String? = null,
    var telefono: String? = null,
    var direccion: String? = null,
    var fechanac: String? = null,
    var genero: String? = null,
){
    constructor(codigo: Int, correo: String, password: String, nombre: String, apellido: String, telefono: String) : this(
        "",
        codigo,
        correo,
        password,
        nombre,
        apellido,
        telefono
    )
}
