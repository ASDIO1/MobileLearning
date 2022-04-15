package bo.edu.ucb.guidep2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class UserListAdapter(val list: ArrayList<User>, val parentActivity: Context) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.user_row, parent, false) //Enlace a user_row
        return UserViewHolder(view)
    }

    class UserViewHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val user = list.get(position)
        holder.itemView.findViewById<TextView>(R.id.userNameTextView).text = user.nombre
        holder.itemView.findViewById<TextView>(R.id.userEmailTextView).text = user.correo
    }

    override fun getItemCount(): Int {
        return list.size
    }

}
// EN resumen:
// Se sobreescriben metodos de RecyclerView para:
// 1 Enlazar al user_row
// 2 Asignar los valores correspondientes
// 3 Definir numero de elementos en Recyclerview
// Los 2 primeros pasos seguramente por debajo se repiten
// en bucle segun el numero de elementos que hayamos definido en el paso 3