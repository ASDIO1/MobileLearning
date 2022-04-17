package bo.com.ucb.guidep3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inicializacion variable lazy "session" creada en App.kt
        session.user = Usuario("Roberto Carlos", "Callisaya Mamani", 32) // Guia 14
        // session.user = "CALYR.SOFTWARE@GMAIL.COM" // Antes Guia 13 - Cuando user esra String
    }

    // Funcion para abrir otra activity
    fun openSecondActivity(view: View) {
        startActivity(Intent(this, SecondActivity::class.java))
    }

}