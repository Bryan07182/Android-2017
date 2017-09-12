package com.example.usuario.practica8;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText nombre, apellido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        nombre = (EditText)findViewById(R.id.etname);
        apellido = (EditText)findViewById(R.id.etapellido);
        ShakeListener mShaker = new ShakeListener(this);

        mShaker.setOnShakeListener(new ShakeListener.OnShakeListener () {
            public void onShake() {
                nombre.setText("");
                apellido.setText("");
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();


        String nom = nombre.getText().toString();
        String ape = apellido.getText().toString();

        if (id == R.id.btnro) {

            if (nom.length()>0 && ape.length()>0){
                Toast toast = Toast.makeText(getApplicationContext(),nom +" "+ape,Toast.LENGTH_LONG);
                toast.show();
            }
        }
        if (id == R.id.btndo) {

            if (nom.length()>0 && ape.length()>0){

                Toast toast = Toast.makeText(getApplicationContext(),ape +" "+nom,Toast.LENGTH_LONG);
                toast.show();

            }
        }

        if (id == R.id.btn3ro) {

            nombre.setText("");
            apellido.setText("");

        }

        return super.onOptionsItemSelected(item);
    }
}

