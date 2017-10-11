package com.example.usuario.ejerciciolistas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SegundaAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_click);

        TextView t = (TextView)findViewById(R.id.tvMensaje);

        Bundle e = getIntent().getExtras();
        if(e == null) {
            t.setText("");
        } else {
            t.setText(e.getString("Mensaje"));
        }
    }
}
