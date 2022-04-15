package bo.edu.ucb.guidep2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CardViewEx1 : AppCompatActivity() {
    lateinit var rv: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_view_ex1)

        // Admin de layout
        val linearLayoutManager = LinearLayoutManager(this)
        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL

        // Enlazando admin de layout
        rv = findViewById(R.id.cardsRecyclerView)
        rv.layoutManager = linearLayoutManager

        // Data
        val list = arrayListOf<User>( User("roberto1", "calyr.software@gmail.com"),
            User("roberto2", "calyr.software@gmail.com"),
            User("roberto3", "calyr.software@gmail.com"),
            User("roberto4", "calyr.software@gmail.com")
        )

        // Mostrar data via adapter
        rv.adapter = UserListAdapter(list, this)


    }
}