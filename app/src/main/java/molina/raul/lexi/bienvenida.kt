package molina.raul.lexi

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import java.util.ArrayList

class bienvenida : AppCompatActivity() {

    var niveles = ArrayList<Nivel>();



    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bienvenida)
        agregarNivel();
        var listaNiveles: ListView = findViewById(R.id.listaNivelesBienvenida) as ListView;
        var adaptador: AdaptadorNiveles = AdaptadorNiveles(niveles,this);
        listaNiveles.adapter = adaptador;


    }

    fun agregarNivel(){
        niveles.add(Nivel(R.string.n1_basico,R.drawable.basico,2));
        niveles.add(Nivel(R.string.n2_frases,R.drawable.frases,0));
        niveles.add(Nivel(R.string.n3_ocupacion,R.drawable.negocios,0));
    }

    private class AdaptadorNiveles: BaseAdapter{
        var niveles = ArrayList<Nivel>();
        var contexto: Context? =null;

        constructor(niveles: ArrayList<Nivel>,context: Context){
            this.contexto = context;
            this.niveles = niveles;

        }

        override fun getCount(): Int {
            return niveles.size;
        }

        override fun getItem(position: Int): Any {
            return niveles[position];
        }

        override fun getItemId(position: Int): Long {
            return position.toLong();
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            var nivel = niveles[position];
            var inflador = LayoutInflater.from(contexto);
            var vista = inflador.inflate(R.layout.nivel_view,null);

            var imagen = vista.findViewById(R.id.iv_imagenNivel) as ImageView;
            var nombre = vista.findViewById(R.id.tv_tituloNivel) as TextView;
            var avance1 = vista.findViewById(R.id.tv_avance1) as ImageView;
            var avance2 = vista.findViewById(R.id.tv_avance2) as ImageView;
            var avance3 = vista.findViewById(R.id.tv_avance3) as ImageView;

            imagen.setImageResource(nivel.img);
            nombre.setText(nivel.nivel);
            when(nivel.avance){
                0 ->{
                    avance1.setBackgroundResource(R.color.gris);
                    avance2.setBackgroundResource(R.color.gris);
                    avance3.setBackgroundResource(R.color.gris);
                }
                1 ->{
                    avance1.setBackgroundResource(R.drawable.button_gradiant_horizontal_round_corner1);
                    avance2.setBackgroundResource(R.color.gris);
                    avance3.setBackgroundResource(R.color.gris);
                }
                2 ->{
                    avance1.setBackgroundResource(R.drawable.button_gradiant_horizontal_round_corner1);
                    avance2.setBackgroundResource(R.drawable.button_gradiant_horizontal_round_corner1);
                    avance3.setBackgroundResource(R.color.gris);
                }
            }


            return vista;
        }


    }
}