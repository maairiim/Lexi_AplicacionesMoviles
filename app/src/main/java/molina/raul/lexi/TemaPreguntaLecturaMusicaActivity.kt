package molina.raul.lexi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager

class TemaPreguntaLecturaMusicaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tema_pregunta_lectura_musica)

        getSupportActionBar()?.hide();
        getActionBar()?.hide();
        //getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN);
    }
}