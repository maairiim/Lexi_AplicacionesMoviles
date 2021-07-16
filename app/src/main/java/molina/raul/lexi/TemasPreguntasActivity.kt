package molina.raul.lexi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import kotlinx.android.synthetic.main.activity_temas_preguntas.*

class TemasPreguntasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_temas_preguntas)

        getSupportActionBar()?.hide();
        getActionBar()?.hide();
        //getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN);

        negociosimagenbutton.setOnClickListener {
            var intent: Intent = Intent(this, TemaPreguntaVideoActivity::class.java)
            startActivity(intent)
        }

        peliseriesimagenbutton.setOnClickListener {
            var intent: Intent = Intent(this, TemaPreguntaVideoPSActivity::class.java)
            startActivity(intent)
        }

        deportesimagenbutton.setOnClickListener {
            var intent: Intent = Intent(this, TemaPreguntaVideoDeportesActivity::class.java)
            startActivity(intent)
        }

        musicaimagenbutton.setOnClickListener {
            var intent: Intent = Intent(this, TemaPreguntaVideoMusicaActivity::class.java)
            startActivity(intent)
        }

        gastronomiaimagenbutton.setOnClickListener {
            var intent: Intent = Intent(this, TemaPreguntaVideoGastronomiaActivity::class.java)
            startActivity(intent)
        }

        historiaimagenbutton.setOnClickListener {
            var intent: Intent = Intent(this, TemaPreguntaVideoHistoriaActivity::class.java)
            startActivity(intent)
        }

        modaimagenbutton.setOnClickListener {
            var intent: Intent = Intent(this, TemaPreguntaVideoModaActivity::class.java)
            startActivity(intent)
        }

        tradicionesimagenbutton.setOnClickListener {
            var intent: Intent = Intent(this, TemaPreguntaVideoTradicionesActivity::class.java)
            startActivity(intent)
        }


    }
}