package com.example.usuario.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton b1,b2;
    EditText e1,e2,e3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (RadioButton)findViewById(R.id.rbMasculino);
        b2 = (RadioButton)findViewById(R.id.rbFemenino);
        e1 = (EditText) findViewById(R.id.et1);
        e2 = (EditText) findViewById(R.id.et2);
        e3 = (EditText) findViewById(R.id.et3);

    }

    public void botonmasculino (View v){

        Toast.makeText(getApplicationContext(),"Es un bato XP",Toast.LENGTH_SHORT).show();

        e1.setVisibility(View.VISIBLE);
        e2.setVisibility(View.VISIBLE);
        e3.setVisibility(View.INVISIBLE);
    }


    public void botonfemenino (View v){

        Toast.makeText(getApplicationContext(),"Es una mujer XD",Toast.LENGTH_SHORT).show();

        e1.setVisibility(View.VISIBLE);
        e2.setVisibility(View.VISIBLE);
        e3.setVisibility(View.VISIBLE);
    }

}
