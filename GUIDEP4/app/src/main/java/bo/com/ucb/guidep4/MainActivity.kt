package bo.com.ucb.guidep4

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
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
    }
}
