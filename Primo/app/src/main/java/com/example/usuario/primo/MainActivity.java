package com.example.usuario.primo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button comprobar;
    EditText num;
    TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        comprobar=(Button)findViewById(R.id.btnComprobar);
        num=(EditText)findViewById(R.id.edNumero);
        resultado=(TextView)findViewById(R.id.tvResultado);

        comprobar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                String escrito = num.getText().toString();

                if(escrito.isEmpty()){

                    resultado.setText("");
                    Toast.makeText(getApplicationContext(), "Por favor ingrese el numero", Toast.LENGTH_LONG).show();

                }else{

                    int n = Integer.parseInt(num.getText().toString());
                    int res=n%2;

                    if(n==0){

                        Toast.makeText(getApplicationContext(), "Por favor escriba otro numero que no sea 0", Toast.LENGTH_LONG).show();

                    }else{

                        if(res==0){

                            resultado.setText("Numero par");

                        }else {

                            resultado.setText("Numero primo");

                        }
                    }
                }
            }
        });
    }
}
