package bo.edu.ucb.guidep2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity //antiguamente: android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var myToolbar: androidx.appcompat.widget.Toolbar
    lateinit var  layoutPrincipal: View
    lateinit var botonCardViewEx1: Button
    lateinit var botonCardViewEx2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Guia 6: toolbar
        myToolbar = findViewById(R.id.toolbar)
        myToolbar.title = "GuideP2 CustomToolbar"
        setSupportActionBar(myToolbar) //https://developer.android.com/training/appbar/setting-up
        /*
        // Forma alargada:
        supportActionBar.let {
            setSupportActionBar(my_toolbar)
        }*/

        // Guia 8: snackbar
        layoutPrincipal = findViewById(R.id.layoutPrincipal)
        Snackbar.make(layoutPrincipal , getString(R.string.mensaje_snackbar), Snackbar.LENGTH_LONG).show()

        // Guia 9: Cardviews
        botonCardViewEx1 = findViewById(R.id.btnEj1)
        botonCardViewEx1.setOnClickListener {
            val intent = Intent(this, CardViewEx1::class.java)
            startActivity(intent)
        }
    }

    // Guia 7: Menu
    //  Para inicializar el menu que creamos
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }
    //  Para sobreescribir el comportamiento de algun item del menu al hacerle click
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item!!.itemId) {
            R.id.action_search ->{
                Log.d("TEST", "ICON SEARCH")
                true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}