package com.example.usuario.grados;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etGrados;
    TextView resultado;
    Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etGrados=(EditText)findViewById(R.id.etGrados);
        resultado=(TextView)findViewById(R.id.tvResultado);
        btnCalcular=(Button)findViewById(R.id.btncalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double grados, gradosFar;
                grados = Double.parseDouble(etGrados.getText().toString());
                gradosFar = (grados * 1.8) + 32;
                String m1="Hace frio amigo woow", m2="I'm on fire xD";

                int caso=0;
                if (gradosFar<100){
                    caso=1;
                }
                if (gradosFar>=100){
                    caso=2;
                }

                switch (caso){

                    case 1:
                        ((RelativeLayout)findViewById(R.id.layout1)).setBackgroundColor(Color.parseColor("#06A2FC"));
                        resultado.setText(""+m1);
                        break;

                    case 2:
                        ((RelativeLayout)findViewById(R.id.layout1)).setBackgroundColor(Color.parseColor("#D80B0B"));
                        resultado.setText(""+m2);
                        break;

                }

            }

        });

    }
}
