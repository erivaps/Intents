package com.kotlin.intents.intents02

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
/*
        var nombres = intent.getStringExtra("nombres")
        txtResultado.setText(txtResultado.text.toString() + nombres)
        */
        var mydato = intent.getSerializableExtra("myDato") as Dato
        txtResultado.setText("Mi Nombre es: ${mydato.nombre} ${mydato.apellidos}")

    }
}
