package bo.com.ucb.guidep3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    lateinit var txtUserSession: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        Toast.makeText(this, session.user.nombre, Toast.LENGTH_SHORT).show() //Guia 13 y 14. EN la 14 se puso user.nombre, porque user es de tipo User, pero user.nombre es String. Toast solo acepta string
        txtUserSession = findViewById(R.id.textView3)
        txtUserSession.text =  "${session.user.nombre} ${session.user.apellido} ${session.user.edad}"//Guia13: session.user (antes user era un mero string). Ahora se concatenaron cada una de las props del user: User
    }
}