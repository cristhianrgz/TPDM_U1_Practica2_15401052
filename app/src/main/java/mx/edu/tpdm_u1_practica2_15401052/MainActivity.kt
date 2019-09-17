package mx.edu.tpdm_u1_practica2_15401052

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import android.content.DialogInterface
import android.text.InputType
import android.view.View
import android.widget.*
import androidx.core.view.isVisible
import androidx.core.view.marginLeft


class MainActivity : AppCompatActivity() {
    var layu : LinearLayout ?= null
    var vector : RadioButton ?= null
    var matriz : RadioButton ?= null
    var layuOri2 : LinearLayout ?= null
    var Lista : ListView ?= null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        layu = findViewById(R.id.layu)
        layuOri2 = findViewById( R.id.linearOri2)
        vector = findViewById( R.id.rdvector)
        matriz = findViewById( R.id.rdmatriz)


        var txtRenglon = TextView(this)
        txtRenglon.setText("  Renglones: ")
        txtRenglon.textSize = 25f

        var editRenglon = EditText(this)
        editRenglon.setHint("coloque un número        ")
        editRenglon.textSize = 25f
        editRenglon.setInputType(InputType.TYPE_CLASS_NUMBER)

        layuOri2?.addView(txtRenglon)
        layuOri2?.addView(editRenglon)

        vector?.setOnClickListener {
            if (vector?.isChecked == true) {
                layuOri2?.visibility = View.GONE
                txtRenglon?.visibility = View.GONE
                editRenglon?.visibility = View.GONE
            }
        }
        matriz?.setOnClickListener {
            if (matriz?.isChecked == true) {
                layuOri2?.visibility = View.VISIBLE
                txtRenglon?.visibility = View.VISIBLE
                editRenglon?.visibility = View.VISIBLE
            }
        }

        Lista = findViewById( R.id.menuOpciones )
        Lista?.setOnItemClickListener { adapterView, view, i, l ->
            when (i) {
                0 -> capturarVal()
                1 -> mostrarVal()
                2 -> acercaDe()
                3 -> finish()
            }
        }
    }

    fun capturarVal(){
        var capturarValores = Intent(this, Main2Activity::class.java)
        startActivity(capturarValores)
    }

    fun mostrarVal(){
        var mostrarValores = Intent(this, Main3Activity::class.java)
        startActivity(mostrarValores)
    }

    fun acercaDe(){
        val alerta = AlertDialog.Builder(this)
        alerta.setTitle("Acerca de...").setMessage("(C) Cristhian Uriel Rodriguez Rodriguez"+'\n'+"Ingeniería en Sistemas Computacionales"+'\n'+"15401052")
        alerta.setCancelable(false)
        alerta.setNegativeButton("Cancelar") { dialog, which -> }
        alerta.setPositiveButton("Aceptar") { dialog, which -> }
        alerta.show()
    }
}
