package molina.raul.lexi.ui.home

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import molina.raul.lexi.Nivel
import molina.raul.lexi.R
import molina.raul.lexi.databinding.FragmentHomeBinding
import java.util.ArrayList

class HomeFragment : Fragment() {

    var niveles = ArrayList<Nivel>();

    private lateinit var homeViewModel: HomeViewModel
    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        agregarNivel();
        var listaNiveles: ListView = root.findViewById(R.id.listaNivelesBienvenida) as ListView;
        //var adaptador: AdaptadorNiveles = AdaptadorNiveles(niveles, this);
        //var adaptador: AdaptadorNiveles = AdaptadorNiveles(niveles, this);
        //listaNiveles.adapter = adaptador;

        return root
    }

    fun agregarNivel() {
        niveles.add(Nivel(R.string.n1_basico, R.drawable.basico, 2));
        niveles.add(Nivel(R.string.n2_frases, R.drawable.frases, 0));
        niveles.add(Nivel(R.string.n3_ocupacion, R.drawable.negocios, 0));
    }

    private class AdaptadorNiveles : BaseAdapter {
        var niveles = ArrayList<Nivel>();
        var contexto: Context? = null;

        constructor(niveles: ArrayList<Nivel>, context: Context) {
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
            var vista = inflador.inflate(R.layout.nivel_view, null);

            var imagen = vista.findViewById(R.id.iv_imagenNivel) as ImageView;
            var nombre = vista.findViewById(R.id.tv_tituloNivel) as TextView;
            var avance1 = vista.findViewById(R.id.tv_avance1) as ImageView;
            var avance2 = vista.findViewById(R.id.tv_avance2) as ImageView;
            var avance3 = vista.findViewById(R.id.tv_avance3) as ImageView;

            imagen.setImageResource(nivel.img);
            nombre.setText(nivel.nivel);
            when (nivel.avance) {
                0 -> {
                    avance1.setBackgroundResource(R.color.gris);
                    avance2.setBackgroundResource(R.color.gris);
                    avance3.setBackgroundResource(R.color.gris);
                }
                1 -> {
                    avance1.setBackgroundResource(R.drawable.button_gradiant_horizontal_round_corner1);
                    avance2.setBackgroundResource(R.color.gris);
                    avance3.setBackgroundResource(R.color.gris);
                }
                2 -> {
                    avance1.setBackgroundResource(R.drawable.button_gradiant_horizontal_round_corner1);
                    avance2.setBackgroundResource(R.drawable.button_gradiant_horizontal_round_corner1);
                    avance3.setBackgroundResource(R.color.gris);
                }
            }

            return vista;
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}