package bo.edu.ucb.guidep1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlin.random.Random

class Par_ImparActivity : AppCompatActivity() {

    // VIEWS:
    private val  contadorIncorrectosTxt : TextView
        get() = findViewById(R.id.incorrectCounterText_ParImpar)
    private val  contadorCorrectosTxt : TextView
        get() = findViewById(R.id.correctCounterText_ParImpar)
    private val  valueParImparTxt : TextView
        get() = findViewById(R.id.valueTxt_ParImpar)
    private val  parBtn : TextView
        get() = findViewById(R.id.imparSelectBtn_ParImpar)
    private val  imparBtn : TextView
        get() = findViewById(R.id.parSelectBtn_ParImpar)

    // VALUES:
    private var contadorIncorrectos = 0
    private var contadorCorrectos = 0
    private var valueParImpar = "0"

    // METHODS:
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_par_impar)

        valueParImpar = generateRandomNumber(0, 10)
        valueParImparTxt.setText(valueParImpar)

        imparBtn.setOnClickListener{
            checkParImparAnswer(imparBtn.text.toString())
            valueParImpar = generateRandomNumber(0, 10)
            valueParImparTxt.setText(valueParImpar)
        }

        parBtn.setOnClickListener{
            checkParImparAnswer(parBtn.text.toString())
            valueParImpar = generateRandomNumber(0, 10)
            valueParImparTxt.setText(valueParImpar)
        }

    }

    private fun generateRandomNumber(startNumber : Int, endNumber : Int): String {
       return Random.nextInt(startNumber, endNumber).toString()
    }

    private fun checkParImparAnswer(odd_or_even : String) {
        val actualValue : String = isParImpar(valueParImparTxt.text.toString())
        if (odd_or_even == actualValue){
            this.contadorCorrectos = contadorCorrectos + 1
            this.contadorCorrectosTxt.text = contadorCorrectos.toString()
        } else {
            this.contadorIncorrectos = contadorIncorrectos + 1
            this.contadorIncorrectosTxt.text = contadorIncorrectos.toString()
        }
    }

    private fun isParImpar(value : String) : String{
        val intVaule = value.toInt()
        if(intVaule % 2 === 0){
            return getString(R.string.par_txt_parimpar)
        } else {
            return getString(R.string.impar_txt_parimpar)
        }
    }
}