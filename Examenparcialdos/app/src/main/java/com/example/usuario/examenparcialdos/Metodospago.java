package com.example.usuario.examenparcialdos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Metodospago extends AppCompatActivity {

     Button boton;
     RadioButton efectivo, tarjeta, paypal;
     RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metodospago);

        radioGroup =(RadioGroup) findViewById(R.id.radioGroup);
        efectivo =(RadioButton) findViewById(R.id.rd1);
        tarjeta =(RadioButton) findViewById(R.id.rd2);
        paypal =(RadioButton) findViewById(R.id.rd3);
        boton =(Button) findViewById(R.id.btn);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(efectivo.isChecked()){

                    Toast.makeText(getApplicationContext(), "Efectivo", Toast.LENGTH_SHORT).show();

                }
                else if(tarjeta.isChecked()){

                    Toast.makeText(getApplicationContext(), "Tarjeta", Toast.LENGTH_SHORT).show();

                }
                else if(paypal.isChecked()){

                    Toast.makeText(getApplicationContext(), "Paypal", Toast.LENGTH_SHORT).show();

                }
            }
        });

        boton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent myIntent = new Intent(Metodospago.this, Opciones.class);
                Metodospago.this.startActivity(myIntent);
                finish();

            }
        });
    }
}
