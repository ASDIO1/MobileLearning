package bo.edu.ucb.guidep2

import androidx.appcompat.app.AppCompatActivity //antiguamente: android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private lateinit var myToolbar: androidx.appcompat.widget.Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myToolbar = findViewById(R.id.toolbar)
        myToolbar.title = "GuideP2 CustomToolbar"
        setSupportActionBar(myToolbar) //https://developer.android.com/training/appbar/setting-up
        /*
        // Forma alargada:
        supportActionBar.let {
            setSupportActionBar(my_toolbar)
        }*/
    }
}