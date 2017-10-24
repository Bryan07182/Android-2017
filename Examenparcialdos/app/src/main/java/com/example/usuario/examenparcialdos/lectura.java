package com.example.usuario.examenparcialdos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class lectura extends AppCompatActivity {

     Button regresar, met;
    EditText txt ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lectura);
        txt =(EditText)findViewById(R.id.txtLeido);
        regresar =(Button) findViewById(R.id.atras);
        met =(Button) findViewById(R.id.metodos);
        String s = getIntent().getStringExtra("TEXTO");

        String[] separated = s.split(",");
        String s1=separated[0];
        String s2=separated[1];
        String s3=separated[2];
        String s4=separated[3];

        txt.setText(s1+ System.getProperty ("line.separator")+s2+System.getProperty ("line.separator")+s3+System.getProperty ("line.separator")+s4);

        met.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent myIntent = new Intent(lectura.this, Metodospago.class);
                lectura.this.startActivity(myIntent);

            }
        });

        regresar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent myIntent = new Intent(lectura.this, Opciones.class);
                lectura.this.startActivity(myIntent);
                finish();

            }
        });
    }

}
