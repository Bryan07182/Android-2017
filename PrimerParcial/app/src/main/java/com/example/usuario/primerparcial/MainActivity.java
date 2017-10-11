package com.example.usuario.primerparcial;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button cinco,quince,treinta,cincuenta,calcular;
    EditText n1,n2,n3;
    TextView t1;
    ImageButton Ibtn1, Ibtn2;
    RelativeLayout l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cinco=(Button)findViewById(R.id.btnCinco);
        quince=(Button)findViewById(R.id.btnQuince);
        treinta=(Button)findViewById(R.id.btnTreinta);
        cincuenta =(Button)findViewById(R.id.btnCincuenta);
        calcular =(Button)findViewById(R.id.btnCalcular);
        n1=(EditText)findViewById(R.id.ed1);
        n2=(EditText)findViewById(R.id.ed2);
        n3=(EditText)findViewById(R.id.ed3);
        Ibtn1=(ImageButton)findViewById(R.id.btnI1);
        Ibtn2=(ImageButton)findViewById(R.id.btnI2);
        l = (RelativeLayout) findViewById(R.id.am);


        cinco.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                String es = n1.getText().toString();

                if (es.isEmpty()) {

                    n2.setText("0");
                    Toast.makeText(getApplicationContext(), "Ingrese total", Toast.LENGTH_LONG).show();

                } else {

                    int b=Integer.parseInt(n2.getText().toString());
                    b=b+5;
                    n2.setText(String.valueOf(b));

                }

            }
        });

        quince.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                String es = n1.getText().toString();

                if (es.isEmpty()) {

                    n2.setText("0");
                    Toast.makeText(getApplicationContext(), "Ingrese total", Toast.LENGTH_LONG).show();

                } else {

                    int b=Integer.parseInt(n2.getText().toString());
                    b=b+15;
                    n2.setText(String.valueOf(b));

                }

            }
        });

        treinta.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                String es = n1.getText().toString();

                if (es.isEmpty()) {

                    n2.setText("0");
                    Toast.makeText(getApplicationContext(), "Ingrese total", Toast.LENGTH_LONG).show();

                } else {

                    int b=Integer.parseInt(n2.getText().toString());
                    b=b+30;
                    n2.setText(String.valueOf(b));

                }

            }
        });

        cincuenta.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                String es = n1.getText().toString();

                if (es.isEmpty()) {

                    n2.setText("0");
                    Toast.makeText(getApplicationContext(), "Ingrese total", Toast.LENGTH_LONG).show();

                } else {

                    int b=Integer.parseInt(n2.getText().toString());
                    b=b+50;
                    n2.setText(String.valueOf(b));

                }

            }
        });

        calcular.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                int a=Integer.parseInt(n1.getText().toString());
                int b=Integer.parseInt(n2.getText().toString());
                int por=(b*100)/a;
                n3.setText(String.valueOf(por+"%"));

                if((a*.7)<=((por/100)*a)){

                    l.setBackgroundColor(Color.parseColor("#FF0000"));

                }else{

                    l.setBackgroundColor(Color.parseColor("#ffffff"));

                }

            }
        });

        Ibtn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                String es = n1.getText().toString();

                if (es.isEmpty()) {

                    Toast.makeText(getApplicationContext(), "Ingrese total", Toast.LENGTH_LONG).show();

                }else{

                    int a=Integer.parseInt(n2.getText().toString());
                    int res=a*80;
                    Toast.makeText(getApplicationContext(), String.valueOf(res)+" total", Toast.LENGTH_LONG).show();

                }

            }
        });

        Ibtn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                int a=Integer.parseInt(n2.getText().toString());
                int res=a*80;
                Toast.makeText(getApplicationContext(), String.valueOf(res)+" actual", Toast.LENGTH_LONG).show();

            }
        });
    }
}