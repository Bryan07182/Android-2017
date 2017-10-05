package com.example.usuario.practica13;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segunda_activity);

        String newString;

        if (savedInstanceState == null) {

            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                newString= null;

            } else {

                newString= extras.getString("cadena");

            }

        } else {

            newString= (String) savedInstanceState.getSerializable("cadena");

        }

        ((TextView)findViewById(R.id.tvmensaje)).setText(newString);

    }
}
