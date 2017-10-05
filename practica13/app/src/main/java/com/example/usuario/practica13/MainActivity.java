package com.example.usuario.practica13;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    SharedPreferences MY_PREFS_NAME = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        MY_PREFS_NAME = getSharedPreferences("firstrun", MODE_PRIVATE);

        if (MY_PREFS_NAME.getBoolean("firstrun", true)){

            MY_PREFS_NAME.edit().putBoolean("firstrun", false).commit();
            Intent P = new Intent(this, PaseoActivity.class);
            startActivity(P);

        }
    }

    public void sda(View view){

        Intent i = new Intent(view.getContext(), SegundaActivity.class);
        EditText et = (EditText)findViewById(R.id.ETescribir);
        i.putExtra("cadena", et.getText().toString());
        startActivity(i);

    }
}
