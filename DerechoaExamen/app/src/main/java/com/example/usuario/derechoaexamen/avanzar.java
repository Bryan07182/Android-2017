package com.example.usuario.derechoaexamen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class avanzar extends AppCompatActivity {

     TextView nombre;
     Button regresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avanzar);
        nombre = (TextView) findViewById(R.id.nombre);
        regresar = (Button) findViewById(R.id.atras);
        String data = getIntent().getExtras().getString("key");
        nombre.setText(data);

        regresar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent myIntent = new Intent(avanzar.this, pasardatos.class);
                avanzar.this.startActivity(myIntent);
                finish();

            }
        });
    }
}
