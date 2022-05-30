package bo.com.ucb.alertsdialogs_navdrawer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    val buttonAlert01: Button
        get() = findViewById(R.id.btn_alert_01)

    val buttonAlert02: Button
        get() = findViewById(R.id.btn_alert_02)

    val buttonAlert1: Button
        get() = findViewById(R.id.btn_alert_1)

    val buttonAlert2: Button
        get() = findViewById(R.id.btn_alert_2)

    val buttonAlert3: Button
        get() = findViewById(R.id.btn_alert_3)

    val buttonAlert4: Button
        get() = findViewById(R.id.btn_alert_4)

    val buttonAlert5: Button
        get() = findViewById(R.id.btn_alert_5)

    val buttonAlert6: Button
        get() = findViewById(R.id.btn_alert_6)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonAlert0.setOnClickListener {
            val builder = AlertDialog.Builder(it.context) // Builder needs a context
            builder.setTitle("Android Alert")
            builder.setMessage("We have a message")
            builder.show()
        }

        /*buttonAlert.setOnClickListener {
            val builder = AlertDialog.Builder(it.context)
            builder.setTitle("Android Alert")
            builder.setMessage("We have a message")

            builder.setPositiveButton("Ok") { _,_ ->
                Toast.makeText(it.context, "Okey", Toast.LENGTH_LONG).show()
            }

            builder.setNegativeButton("No okey") {
                    dialog, i ->
                Toast.makeText(it.context, "No Okey", Toast.LENGTH_LONG).show()
            }

            builder.setNeutralButton("Maybe", DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(it.context, "Maybe", Toast.LENGTH_LONG).show()
            })
            builder.show()
        }*/

    }
}