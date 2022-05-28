package bo.com.ucb.guidep4

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private val swipeToRefresLayout: androidx.swiperefreshlayout.widget.SwipeRefreshLayout
        get() = findViewById(R.id.swipeToRefresLayout)

    private val  message_text_view : TextView
        get() = findViewById(R.id.message_text_view)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        swipeToRefresLayout.setOnRefreshListener {
            message_text_view.text = Random(100).nextInt(100).toString()
            swipeToRefresLayout.isRefreshing = false
            Log.d(TAG, message_text_view.text.toString())

        }
    }
}