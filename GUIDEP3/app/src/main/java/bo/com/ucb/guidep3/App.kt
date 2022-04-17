package bo.com.ucb.guidep3

import android.app.Application

val session: Prefs by lazy {
    App.prefs!!
}
class App: Application() {
    companion object {
        var prefs: Prefs? = null //SUpongo que reestablece el valor de prefs en Application()
    }
    override fun onCreate() {
        prefs = Prefs(applicationContext) //SUpongo que indica y obtiene automaticamente el contexto (Activity/View) obtener las prefs
        super.onCreate()
    }
}

// Prefs by lazy
// Basicamente es una forma de "lateinit" para inicializar propiedades de tipo "val"
// "session" Al estar fuera de la clase "App" parace que es
//  una especie de variable global, que se puede inicializar directamente desde el Activity.kt
//  o desde otra parte cualquiera de un modulo
//  Parece que se la puso en este archivo, por logica, porque esta relacionada de alguna forma
//  con la clase App.
// (Prefs es la clase de preferncias creada anteriormente)

// PREFS
// Aplication es: "Base class for maintaining global application state."

// Esta seria una subclase de Application para manejar y configurar
// el estado de la app manualmente

// Ademas: "The Application class, or your subclass of the Application class, is instantiated
// before any other class when the process for your application/package is created."

// SEGUN: https://developer.android.com/reference/android/app/Application