package molina.raul.lexi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class pantallaPrincipalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_principal)

        var button_CrearCuenta = findViewById(R.id.crear_cuenta) as Button;
        var ib_redes = findViewById(R.id.imageButtonRedes) as ImageButton;

        button_CrearCuenta.setOnClickListener{
            var intent: Intent = Intent(this, crearCuentaActivity::class.java);
            startActivity(intent);
        }

        ib_redes.setOnClickListener{
            var intent: Intent = Intent(this, login::class.java);
            startActivity(intent);
        }

    }
}