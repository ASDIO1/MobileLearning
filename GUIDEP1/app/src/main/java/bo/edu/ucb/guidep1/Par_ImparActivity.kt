package bo.edu.ucb.guidep1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlin.random.Random

class Par_ImparActivity : AppCompatActivity() {

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

    private var contadorIncorrectos = 0
    private var contadorCorrectos = 0
    private var valueParImpar = "0"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_par_impar)

        valueParImpar = generateRandomNumber(0, 10)
        valueParImparTxt.setText(valueParImpar)

        valueParImparTxt.setOnClickListener{

        }

    }

    private fun generateRandomNumber(startNumber : Int, endNumber : Int): String {
       return Random.nextInt(startNumber, endNumber).toString()
    }
}