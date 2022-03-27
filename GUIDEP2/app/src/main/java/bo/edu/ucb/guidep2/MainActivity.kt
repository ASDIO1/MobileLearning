package bo.edu.ucb.guidep2

import androidx.appcompat.app.AppCompatActivity //antiguamente: android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar.let {
            setSupportActionBar(findViewById(R.id.toolbar))
        }
        //setSupportActionBar(findViewById(R.id.toolbar)) //https://developer.android.com/training/appbar/setting-up
    }
}