package com.example.usuario.practica4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class proyecto4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String nombre = "Bryan";
        String apellido = "Peña";
        Toast toast = Toast.makeText(this, nombre+ " "+apellido,Toast.LENGTH_LONG);
        toast.show();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proyecto4);
    }
}
