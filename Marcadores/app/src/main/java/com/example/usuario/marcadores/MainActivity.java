package com.example.usuario.marcadores;

import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button suma1,suma2,resta1,resta2;
    TextView n1,n2;
    SensorManager mSensorMgr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        suma1=(Button)findViewById(R.id.btnSumar1);
        suma2=(Button)findViewById(R.id.btnSumar2);
        resta1=(Button)findViewById(R.id.btnRestar1);
        resta2=(Button)findViewById(R.id.btnRestar2);
        n1=(TextView)findViewById(R.id.tvNumero1);
        n2=(TextView)findViewById(R.id.tvNumero2);
        ShakeListener mShaker= new ShakeListener(this);


        suma1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                int n=Integer.parseInt(n1.getText().toString());
                int total=n+1;
                n1.setText(String.valueOf(total));
            }
        });

        resta1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                int n=Integer.parseInt(n1.getText().toString());
                int total=n-1;
                if(total<0){
                    n1.setText(String.valueOf("0"));
                }else {
                    n1.setText(String.valueOf(total));
                }
            }
        });

        suma2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                int n=Integer.parseInt(n2.getText().toString());
                int total=n+1;
                n2.setText(String.valueOf(total));
            }
        });

        resta2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                int n=Integer.parseInt(n2.getText().toString());
                int total=n-1;
                if(total<0){
                    n2.setText(String.valueOf("0"));
                }else {
                    n2.setText(String.valueOf(total));
                }

            }
        });

        mShaker.setOnShakeListener(new ShakeListener.OnShakeListener () {
            public void onShake() {
                n1.setText("0");
                n2.setText("0");

            }
        });



    }
}