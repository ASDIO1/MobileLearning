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

        Toast.makeText(this, session.user, Toast.LENGTH_SHORT).show()
        txtUserSession = findViewById(R.id.textView3)
        txtUserSession.text = session.user
    }
}