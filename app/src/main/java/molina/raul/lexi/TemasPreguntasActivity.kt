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



    }
}