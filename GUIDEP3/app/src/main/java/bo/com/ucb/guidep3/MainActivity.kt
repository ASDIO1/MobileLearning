package bo.com.ucb.guidep3

import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.net.NetworkInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var button3: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inicializacion variable lazy "session" creada en App.kt
        session.user = Usuario("Roberto Carlos", "Callisaya Mamani", 32) // Guia 14
        // session.user = "CALYR.SOFTWARE@GMAIL.COM" // Antes Guia 13 - Cuando user esra String

        // Guia 15: internet?
        button3 = findViewById(R.id.internetButton)
        button3.setOnClickListener {
            if(isConexion(applicationContext)) {
                Toast.makeText(this, "Tiene acceso a internet", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "No tiene acceso a internet", Toast.LENGTH_LONG).show()
            }
        }

    }

    // Funcion para abrir otra activity
    fun openSecondActivity(view: View) {
        startActivity(Intent(this, SecondActivity::class.java))
    }

    // Guia 15: internet?
    fun isConexion( context: Context) : Boolean {
        val cm = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetwork: NetworkInfo? = cm.activeNetworkInfo
        return activeNetwork?.isConnectedOrConnecting == true
    }
}