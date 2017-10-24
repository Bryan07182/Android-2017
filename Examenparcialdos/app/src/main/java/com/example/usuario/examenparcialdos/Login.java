package com.example.usuario.examenparcialdos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;

public class Login extends AppCompatActivity {

    TextView contrasena, correos;
    Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        correos=(EditText)findViewById(R.id.edCorreo);
        contrasena=(EditText)findViewById(R.id.edContra);
        Login=(Button)findViewById(R.id.btnLogin);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String usuario= correos.getText().toString();
                String password= contrasena.getText().toString();

                if (usuario.equals("segundoparcial")&& password.equals("1"))
                {
                   Intent newform = new Intent(Login.this,Opciones.class);
                    startActivity(newform);
                   Toast.makeText(getApplicationContext(), "Bienvenido", Toast.LENGTH_SHORT).show();

                }
                else {
                    Toast.makeText(getApplicationContext(), "Usuario y/o contraseña incorrectos", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}