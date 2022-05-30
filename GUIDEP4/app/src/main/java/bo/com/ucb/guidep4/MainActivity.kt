package bo.com.ucb.guidep4

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.ContentValues.TAG
import android.content.Context
import android.content.Intent
import android.media.RingtoneManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.app.NotificationCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private val swipeToRefresLayout: androidx.swiperefreshlayout.widget.SwipeRefreshLayout
        get() = findViewById(R.id.swipeToRefresLayout)

    private val  message_text_view : TextView
        get() = findViewById(R.id.message_text_view)

    private val  recyclerView : RecyclerView
        get() = findViewById(R.id.usersRecyclerView)

    private val  btnNotificacion : Button
        get() = findViewById(R.id.btn_notifi_interna)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // GUIA 18 - RecyclerView
        val lista = arrayListOf<Usuario>()
        lista.add(Usuario("Roberto Carlos Callisaya Mamani", "calyr.software@gmail.com"))
        lista.add(Usuario("Gabriela Orosco Montaño", "gabriela_ocsoro@gmail.com"))

        val userListAdapter = UserListAdapter(lista, this)
        recyclerView.adapter = userListAdapter
        val linearLayoutManager = LinearLayoutManager(this)
        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = linearLayoutManager

        // GUIA 17 - SWIPE
        swipeToRefresLayout.setOnRefreshListener {
            message_text_view.text = Random(20).nextInt(0, 100).toString()
            swipeToRefresLayout.isRefreshing = false
            Log.d(TAG, message_text_view.text.toString())
        }

        // GUIA 19 - NOTIFICACION INTERNA
        btnNotificacion.setOnClickListener{
            notificacionInterna()
        }
    }

    fun notificacionInterna() {
        val i = Intent(this, MainActivity::class.java)
        val pendingIntent = PendingIntent.getActivity(this, 0, i, PendingIntent.FLAG_ONE_SHOT)

        val sonido = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)
        val CHANNEL_ID = "my_channel_01"
        if ( Build.VERSION.SDK_INT >= 26) {
            val name = getString(R.string.channel_name)
            val descriptionText = getString(R.string.channel_description)
            val importance = NotificationManager.IMPORTANCE_DEFAULT
            val channel = NotificationChannel(CHANNEL_ID, name, importance).apply {
                description = descriptionText
            }
            // Register the channel with the system
            val notificationManager: NotificationManager =
                getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(channel)
        }

        val notification = NotificationCompat.Builder(this, CHANNEL_ID)
            .setSmallIcon(R.drawable.ic_launcher_background)
            .setContentTitle("Notificación")
            .setContentText("Notificaciones Internas")
            .setSound(sonido)
            .setContentIntent(pendingIntent)
            .setAutoCancel(true)

        val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        notificationManager.notify(0, notification.build())
    }
}