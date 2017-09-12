package com.example.usuario.piedrapapelotijeras;

import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.concurrent.ThreadLocalRandom;

public class MainActivity extends AppCompatActivity {

    TextView resultado;
    ImageView imagen;
    SensorManager mSensorMgr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultado=(TextView)findViewById(R.id.tvResultado);
        imagen=(ImageView)findViewById(R.id.imagen);
        ShakeListener mShaker = new ShakeListener(this);

        mShaker.setOnShakeListener(new ShakeListener.OnShakeListener () {
            public void onShake() {

                int rn= ThreadLocalRandom.current().nextInt(1,3 +1);
                if (rn==1){
                    Picasso.with(getApplicationContext()).load("http://vignette4.wikia.nocookie.net/thelegend-of-zelda-fanon/images/d/d0/Piedra.png/revision/latest?cb=20130329024710&path-prefix=es").into(imagen);


                }else {
                    if (rn==2){
                        Picasso.with(getApplicationContext()).load("https://image.flaticon.com/icons/png/512/42/42073.png").into(imagen);



                    }else {
                        Picasso.with(getApplicationContext()).load("https://image.flaticon.com/icons/png/512/27/27529.png").into(imagen);



                    }
                }



            }
        });

    }
}
