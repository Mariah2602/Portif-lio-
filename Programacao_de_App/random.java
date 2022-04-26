import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText d, l;
    TextView r;
    ImageView imgDado;
    int num_dados, num_lados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        d = findViewById(R.id.dados);
        l =  findViewById(R.id.lados);
        r = findViewById(R.id.resultado);
        imgDado = findViewById(R.id.img);
    }
    public void play(View dadedidodu){
        try{
            num_dados = Integer.parseInt(d.getText().toString());
            num_lados = Integer.parseInt(l.getText().toString());
        }
        catch (Exception e){
            num_dados = 0;
            num_lados = 0;
            Toast.makeText(this, "Digite todas as informações!", Toast.LENGTH_LONG).show();

        }
        Random mauricio = new Random();
        /*
        String s = "Resultado: \n";
        int q = 0;
        while (q < num_dados){
            q++;
            s += "Dado "+q+": "+ (mauricio.nextInt(num_lados)+1) +"\n";
        }
        r.setText(s);
        /*

         */
        int gerado = mauricio.nextInt(num_lados);
        if(num_lados == 4){
            if(gerado == 1){
                imgDado.setImageResource(R.drawable.lado4_1);
                imgDado.setImageResource(R.drawable.lado4_2);
                imgDado.setImageResource(R.drawable.lado4_3);
                imgDado.setImageResource(R.drawable.lado4_4);

            }
        }
        else if(num_lados == 6){
            imgDado.setImageResource(R.drawable.lado6_1);
            imgDado.setImageResource(R.drawable.lado6_2);
            imgDado.setImageResource(R.drawable.lado6_3);
            imgDado.setImageResource(R.drawable.lado6_4);
            imgDado.setImageResource(R.drawable.lado6_5);
            imgDado.setImageResource(R.drawable.lado6_6);



        }

    }
