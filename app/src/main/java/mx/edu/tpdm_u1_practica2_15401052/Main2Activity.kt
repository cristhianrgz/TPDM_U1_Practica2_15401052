package mx.edu.tpdm_u1_practica2_15401052

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView

class Main2Activity : AppCompatActivity() {
        var layuOri23 : LinearLayout ?=null
        var regresar : Button ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        layuOri23 = findViewById( R.id.linearOri23)
        regresar = findViewById( R.id.btnRegresar)

        var txtRenglon = TextView(this)
        txtRenglon.setText("Posición R: ")
        txtRenglon.textSize = 25f

        var editRenglon = EditText(this)
        editRenglon.textSize = 25f
        editRenglon.setInputType(InputType.TYPE_CLASS_NUMBER)
        editRenglon.setHint("coloque un número")
        layuOri23?.addView(txtRenglon)
        layuOri23?.addView(editRenglon)

        regresar?.setOnClickListener {
            finish()
        }
    }
}
