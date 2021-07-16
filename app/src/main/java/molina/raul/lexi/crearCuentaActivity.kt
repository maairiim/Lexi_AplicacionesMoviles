package molina.raul.lexi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class crearCuentaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crear_cuenta)

        var volverCC = findViewById(R.id.backbuttontemalectura2) as Button;

        volverCC.setOnClickListener{
            var intent: Intent = Intent(this, pantallaPrincipalActivity::class.java)
            startActivity(intent)
        }
    }


}