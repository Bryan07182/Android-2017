package com.example.usuario.practica5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import de.keyboardsurfer.android.widget.crouton.Crouton;
import de.keyboardsurfer.android.widget.crouton.Style;

public class MainActivity extends AppCompatActivity {

    EditText etPeso, etAltura;
    TextView resultado, descripcion;
    Button btnCalcular;
    ImageView imagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etPeso=(EditText)findViewById(R.id.etPeso);
        etAltura=(EditText)findViewById(R.id.etAltura);
        resultado=(TextView)findViewById(R.id.tvResultado);
        descripcion=(TextView)findViewById(R.id.tvDescripcion);
        btnCalcular=(Button)findViewById(R.id.btnCalcular);
        imagen=(ImageView)findViewById(R.id.imagen);


        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               double peso, altura, IMC;
                String m1="El paciente se encuentra en un peso bajo", m2="El paciente se encuentra en el peso adecuado", m3="El paciente no se encuentra en el peso adecuado";
                peso= Double.parseDouble(etPeso.getText().toString());
                altura= Double.parseDouble(etAltura.getText().toString());
                //peso/altura(m2)
                IMC=peso/Math.pow(altura,2);


                int caso=0;
                if (IMC<=18.5){
                    caso=1;
                }
                if (IMC>18.5 && IMC <24.99){
                    caso=2;
                }
                if (IMC>25){
                    caso=3;
                }
                /*
                else {
                    Toast toast =  Toast.makeText(MainActivity.this,"Debe ingresar todos los valores",Toast.LENGTH_LONG);
                    toast.show();
                }
                */
                switch (caso){
                    case 1:
                        Picasso.with(getApplicationContext()).load("https://previews.123rf.com/images/nlshop1/nlshop11602/nlshop1160200186/52578559-Mujer-bajo-peso-de-dibujos-animados-Foto-de-archivo.jpg").into(imagen);
                        Crouton.makeText(MainActivity.this, "Peso Bajo", Style.INFO ).show();
                        descripcion.setText(""+m1);
                        break;
                    case 2:
                        Picasso.with(getApplicationContext()).load("http://www.realmenrealstyle.com/wp-content/uploads/2012/01/images3.jpg").into(imagen);
                        Crouton.makeText(MainActivity.this, "Peso Normal", Style.CONFIRM ).show();
                        descripcion.setText(""+m2);
                        break;
                    case 3:
                        //cargar imagen ahora desde los recursos y no de internet
                        Picasso.with(getApplicationContext()).load(R.drawable.gordo).into(imagen);
                        Crouton.makeText(MainActivity.this, "Sobre Peso", Style.ALERT ).show();
                        descripcion.setText(""+m3);
                        break;
                }

                resultado.setText(""+IMC);

            }
        });
    }
}
