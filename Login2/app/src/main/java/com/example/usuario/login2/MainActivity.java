package com.example.usuario.login2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView contrasena, correos;
    Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        correos=(EditText)findViewById(R.id.edCorreo);
        contrasena=(EditText)findViewById(R.id.edContra);
        Login=(Button)findViewById(R.id.btnLogin);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String usuario= correos.getText().toString();
                String password= contrasena.getText().toString();

                if (usuario.equals("admin@hotmail.com")&& password.equals("admin"))
                {
                    Intent newform = new Intent(MainActivity.this,Main3Activity.class);
                    startActivity(newform);

                }
                else {
                    Toast.makeText(getApplicationContext(), "Usuario incorrecto", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}