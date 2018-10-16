package com.kotlin.intents.intents02

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun enviarSecondActivity(view: View){
/* //pasar info por Intent
        var myIntent = Intent(this,SecondActivity::class.java)
        myIntent.putExtra("nombres",txtNombres.text.toString())
        startActivity(myIntent)
        */

        var myIntent = Intent(this,SecondActivity::class.java)
        var myDato = Dato(txtNombres.text.toString(),txtApellidos.text.toString())
        myIntent.putExtra("myDato",myDato) //as Seriarfizable)
        startActivity(myIntent)

    }
}
