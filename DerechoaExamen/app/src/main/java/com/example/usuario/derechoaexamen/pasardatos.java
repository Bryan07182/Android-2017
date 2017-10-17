package com.example.usuario.derechoaexamen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class pasardatos extends AppCompatActivity {

     EditText nombre, apellido;
     Button avanzar, regresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasar);
        nombre = (EditText) findViewById(R.id.nombre);
        apellido = (EditText) findViewById(R.id.apellido);
        avanzar = (Button) findViewById(R.id.sig);
        regresar = (Button) findViewById(R.id.atras);

        avanzar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                String n=nombre.getText().toString();
                String a=apellido.getText().toString();
                if(n.equals("") || a.equals("")){
                    Toast.makeText(getApplicationContext(), "Por favor ingrese todos los campos", Toast.LENGTH_SHORT).show();

                }else{

                    String total=n+" "+a;
                    Intent myIntent = new Intent(pasardatos.this, avanzar.class);
                    myIntent.putExtra("key", total);
                    pasardatos.this.startActivity(myIntent);
                    finish();

                }

            }
        });

        regresar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent myIntent = new Intent(pasardatos.this, MainActivity.class);
                pasardatos.this.startActivity(myIntent);
                finish();

            }
        });

    }
}
