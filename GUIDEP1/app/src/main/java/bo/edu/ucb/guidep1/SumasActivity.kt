package bo.edu.ucb.guidep1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.widget.addTextChangedListener
import androidx.core.widget.doAfterTextChanged
import androidx.core.widget.doOnTextChanged

class SumasActivity : AppCompatActivity() {

    //ELEMENTOS UI:
    private val sumando1Number : TextView
        get() = findViewById(R.id.numberSumando1)
    private val sumando2Number : TextView
        get() = findViewById(R.id.numberSumando2)
    private val resultadoSumaNumber : TextView
        get() = findViewById(R.id.numberSumaResult)
    private val  sumarBtn: Button
        get() = findViewById(R.id.btnSumar)
    //PROPS:

    //METODOS:

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sumas)

        sumarBtn.setOnClickListener{
            sumar(sumando1Number.text.toString(), sumando2Number.text.toString())
        }
    }

    private fun sumar(sumando1: String, sumando2: String) {
        if(!sumando1.isNullOrEmpty() && !sumando2.isNullOrEmpty()){
            val sum_result = sumando1.toInt() + sumando2.toInt()
            resultadoSumaNumber.text = sum_result.toString()
        }
    }
}