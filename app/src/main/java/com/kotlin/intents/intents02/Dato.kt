package com.kotlin.intents.intents02

import java.io.Serializable

class Dato: Serializable{
    var nombre: String?=null
    var apellidos: String?=null


    constructor(nombre: String?, apellidos: String?) {
        this.nombre = nombre
        this.apellidos = apellidos
    }
}