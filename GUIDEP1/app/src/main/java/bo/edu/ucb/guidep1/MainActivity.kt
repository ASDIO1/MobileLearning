package bo.edu.ucb.guidep1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

import android.view.View
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    private val  negocioSeleccionadoTxt : TextView
        get() = findViewById(R.id.txtNegocioSeleccionado)
    private val serviciosBtn : Button
        get() = findViewById(R.id.btnServicios)
    private val portafolioBtn : Button
        get() = findViewById(R.id.btnPortafolio)
    private val acercadeBtn : Button
        get() = findViewById(R.id.btnAcercaDe)
    private val contactoBtn : Button
        get() = findViewById(R.id.btnContacto)
    private val redessocialesBtn : Button
        get() = findViewById(R.id.btnRedesSociales)

    private val parImparBtn : Button
        get() = findViewById(R.id.btnParImpar)

    private val sumasBtn : Button
        get() = findViewById(R.id.btnSumas)

    private val alineadosBtn : Button
        get() = findViewById(R.id.btnBotonesAlineados)

    private val formularioBtn : Button
        get() = findViewById(R.id.btnFormulario)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // TODO:  Refactorizar codigo duplicado. Uso de intent y startActivity

        formularioBtn.setOnClickListener {
            val intent = Intent(this, FormularioActivity::class.java)
            startActivity(intent)
        }

        alineadosBtn.setOnClickListener {
            val intent = Intent(this, BotonesAlineadosActivity::class.java)
            startActivity(intent)
        }

        parImparBtn.setOnClickListener {
            val intent = Intent(this, Par_ImparActivity::class.java)
            startActivity(intent)
        }

        sumasBtn.setOnClickListener {
            val intent = Intent(this, SumasActivity::class.java)
            startActivity(intent)
        }

        serviciosBtn.setOnClickListener {
            negocioSeleccionadoTxt.text = serviciosBtn.text //setText(portafolioBtn.text) Esta forma sirve pero sale warning de optimizacion
            //selectedButton()   esto se asigno en el onClick del .xml en la barra de atributos
            val intent = Intent(this, ServiciosActivity::class.java)
            startActivity(intent) // para transicionar a ServiciosActivity

        }

        portafolioBtn.setOnClickListener {
            negocioSeleccionadoTxt.text = portafolioBtn.text
        }
        acercadeBtn.setOnClickListener {
            negocioSeleccionadoTxt.text = acercadeBtn.text
        }
        contactoBtn.setOnClickListener {
            negocioSeleccionadoTxt.text = contactoBtn.text
        }
        redessocialesBtn.setOnClickListener {
            negocioSeleccionadoTxt.text = redessocialesBtn.text
        }
    }

    fun selectedButton(view: View) {
        if ( view.id === R.id.btnServicios) {
            Toast.makeText( view.context, "Opcion de Servicios", Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText( view.context, "Evento no definido", Toast.LENGTH_LONG).show()
        }
    }

}


/*  EJERCICIO 0:  BOTONES ROJO Y BLANCO

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.graphics.Color
//import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
//import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    // Para findViewById:
    // Desde el API 26+  se necesita especificar el tipo de retorno
    // Referencia: https://stackoverflow.com/questions/45267041/not-enough-information-to-infer-parameter-t-with-kotlin-and-android

    private val redBtn : Button
        get() = findViewById<Button>(R.id.btnRed)

    private val whiteBtn: Button
        get() = findViewById<Button>(R.id.btnWhite)

    private val layoutPrincipal: LinearLayout
        get() = findViewById<LinearLayout>(R.id.layoutPrincipal)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        redBtn.setOnClickListener {
            toast(getString(R.string.btn_red))
            layoutPrincipal.setBackgroundColor(Color.RED)
        }
        whiteBtn.setOnClickListener {
            toast(getString(R.string.btn_white))
            layoutPrincipal.setBackgroundColor(Color.WHITE)
        }

        // Tiene sentido que los Listener se asignen al crearse un layout o view
        // de esta forma los elementos o views estan listos para responder a sus eventos.

    }
    private fun toast(text: String, duration: Int = Toast.LENGTH_LONG) =
        Toast.makeText(this@MainActivity, text, Toast.LENGTH_LONG).show()
}

* */
