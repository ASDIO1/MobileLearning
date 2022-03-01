package bo.edu.ucb.guidep1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.graphics.Color
//import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
//import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    // Para findViewById:
    // Desde el API 26+  se necesita especificar el tipo de retorno
    // Referencia: https://stackoverflow.com/questions/45267041/not-enough-information-to-infer-parameter-t-with-kotlin-and-android

    private val redBtn : Button
        get() = findViewById<Button>(R.id.btnRojo)

    private val whiteBtn: Button
        get() = findViewById<Button>(R.id.btnBlanco)

    private val layoutPrincipal: LinearLayout
        get() = findViewById<LinearLayout>(R.id.layoutMain)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        redBtn.setOnClickListener {
            toast(getString(R.string.btn_red_label))
            layoutPrincipal.setBackgroundColor(Color.RED)
        }
        whiteBtn.setOnClickListener {
            toast(getString(R.string.btn_white_label))
            layoutPrincipal.setBackgroundColor(Color.WHITE)
        }

        // Tiene sentido que los Listener se asignen al crearse un layout o view
        // de esta forma los elementos o views estan listos para responder a sus eventos.

    }
    private fun toast(text: String, duration: Int = Toast.LENGTH_LONG) =
        Toast.makeText(this@MainActivity, text, Toast.LENGTH_LONG).show()
}