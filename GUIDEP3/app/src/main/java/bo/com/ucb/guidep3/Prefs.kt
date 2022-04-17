package bo.com.ucb.guidep3

import android.content.Context
import android.content.SharedPreferences

class Prefs(context: Context) {
    val PREFS_FILENAME = "bo.com.ucb.pref"//"edu.bo.ucb.pref"
    val KEY_USER ="user"
    val prefs: SharedPreferences = context.getSharedPreferences(PREFS_FILENAME, 0)
    var user: String?
        get() = prefs.getString(KEY_USER, null)
        set(value) = prefs.edit().putString(KEY_USER, value).apply()
}

// Haciendo hover sobre SharedPreferences, indica que:
// Basciamente permite guardar preferencias globales para la app
// y que solo debe usarse o asignar las propiedades muy necesarias
// porque es una clase pesada.
// De ser posible usar otras alternativas cuando no importa si las
// propiedades cambian o son desechables