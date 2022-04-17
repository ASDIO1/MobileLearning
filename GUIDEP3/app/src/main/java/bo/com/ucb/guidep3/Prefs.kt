package bo.com.ucb.guidep3

import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson

class Prefs(context: Context) {
    val PREFS_FILENAME = "bo.com.ucb.pref"//"edu.bo.ucb.pref"
    val KEY_USER ="user"
    val prefs: SharedPreferences = context.getSharedPreferences(PREFS_FILENAME, 0)

    var user: Usuario
        get() {
            val gson = Gson()
            return gson.fromJson(prefs.getString(KEY_USER, null), Usuario::class.java)
            //Gson gson = new Gson();
            //retrun gson.fromJson(prefs.getString(KEY_USER,null), Usuario.class);
        }
        set(value) {
            val gson = Gson()
            val userJson = gson.toJson(value)
            prefs.edit().putString(KEY_USER, userJson).apply()
            //	Gson gson = new Gson();
            //	String userJson =gson.toJson(value);
        }

    /*
    Variable dummy de la Guia 13 para momentaneamente tener el user definido
    var user: String?
        get() = prefs.getString(KEY_USER, null)
        set(value) = prefs.edit().putString(KEY_USER, value).apply()*/

}

// GUIA 14:
// OJO: Ya entendi
// En Prefs se guardan algunas propiedades en la sesion de un usuario
// EN este ejemplo el usuario esta hardcodeado, pero seguro en realidad se debe obtener el usuario del celular o de una cuenta
// Toda esta clase representa una caja de sesion identificada con un nombre (PREFS_FILE_NAME)
// Se pueden definir diferentes campos para guardar informacion.
// En este caso estamos haciendo un campo Usuario, de tipo Usuario, que es un data class para representa la estructura de datos a guardar
// Se pueden tener varios de estos campos de ser necesarios (SOlo se necesita una clase que de estructura y ponerle un getter y setter)
// (Quizas incluso pueda ser un campo de tipo String que cuarde un mero String. Aunque quizas no sea buena practica)
// El get()  Obtiene la informacion de una sesion, pidiendo:
//  - una Llave para acceder a esta informacion
//  - La clase que modela la estructura del json que se nos devolvera con los datos de un campo determinado de una sesion.
//     (Prefs guarda un JSON y usamos GSON para deserializar el JSON de retorno, en un Objeto normal del tipo especificado (User en este caso))
// El set()  cambia los valores actuales de un campo, para un usuario especifico pidiendo su KEY y respetando su estructura (clase User)

// Quizas asi se hacia mucho antes?

// GUIA 13:
// Haciendo hover sobre SharedPreferences, indica que:
// Basciamente permite guardar preferencias globales para la app
// y que solo debe usarse o asignar las propiedades muy necesarias
// porque es una clase pesada.
// De ser posible usar otras alternativas cuando no importa si las
// propiedades cambian o son desechables