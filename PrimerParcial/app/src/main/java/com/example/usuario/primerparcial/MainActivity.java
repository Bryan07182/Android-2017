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
        //t1=(TextView)findViewById(R.id.tv1);
        Ibtn1=(ImageButton)findViewById(R.id.btnI1);
        Ibtn2=(ImageButton)findViewById(R.id.btnI2);


        cinco.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                int n=Integer.parseInt(n2.getText().toString());
                int total=n+5;
                n2.setText(String.valueOf(total));
            }
        });

        quince.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                int n=Integer.parseInt(n2.getText().toString());
                int total=n+15;
                n2.setText(String.valueOf(total));
            }
        });

        treinta.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                int n=Integer.parseInt(n2.getText().toString());
                int total=n+30;
                n2.setText(String.valueOf(total));
            }
        });

        cincuenta.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                int n=Integer.parseInt(n2.getText().toString());
                int total=n+50;
                n2.setText(String.valueOf(total));

            }
        });


        Ibtn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                int n=Integer.parseInt(n1.getText().toString());
                int total=(n*80);

                Toast toast = Toast.makeText(getApplicationContext(), "espere que funcionara jeje", Toast.LENGTH_LONG);
                toast.show();

            }
        });

        Ibtn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                int n=Integer.parseInt(n2.getText().toString());
                int total=(n*80);

                Toast toast = Toast.makeText(getApplicationContext(), "espere que funcionara jeje", Toast.LENGTH_LONG);
                toast.show();


            }
        });

        calcular.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                int n=Integer.parseInt(n1.getText().toString());
                int nn=Integer.parseInt(n2.getText().toString());
                int total=((n+nn) * 100/ 2);
                n3.setText(String.valueOf(total));

            }
        });
    }
}
