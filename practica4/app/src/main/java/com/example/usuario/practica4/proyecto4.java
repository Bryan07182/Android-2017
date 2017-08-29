package com.example.usuario.practica4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class proyecto4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int tortas = 3;
        int precio = 40;
        int total = tortas * precio;
        if (total>80){
            Toast toast = Toast.makeText(getApplicationContext(), "Tiene una soda gratis woow XD", Toast.LENGTH_LONG);
            toast.show();
        }else {
            Toast toast = Toast.makeText(getApplicationContext(), "No hay soda amigo :( ", Toast.LENGTH_LONG);
            toast.show();
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proyecto4);
    }
}
